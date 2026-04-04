CREATE DATABASE OnlineVotingSystem;
USE OnlineVotingSystem

CREATE LOGIN voting_database
WITH PASSWORD = 'admin123';

CREATE USER voting_database FOR LOGIN voting_database;
GRANT SELECT, INSERT, UPDATE, DELETE ON SCHEMA::dbo TO voting_database;

-- =========================
-- 1. Voters
-- =========================
CREATE TABLE Voters (
    VoterID BIGINT IDENTITY(100000000000,1) PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    MiddleName VARCHAR(50),
    LastName VARCHAR(50) NOT NULL,
    Sex VARCHAR(10) NOT NULL,
    College VARCHAR(100) NOT NULL,
    DateOfBirth DATE NOT NULL
);

-- =========================
-- 2. Accounts
-- =========================
CREATE TABLE Accounts (
    AccountID INT IDENTITY(1,1) PRIMARY KEY,
    VoterID BIGINT NOT NULL UNIQUE, -- 1 account per voter
    Email VARCHAR(100) NOT NULL UNIQUE,
    Password VARCHAR(255) NOT NULL,
    Type VARCHAR(50) NOT NULL,
    FOREIGN KEY (VoterID) REFERENCES Voters(VoterID) ON DELETE CASCADE
);

-- =========================
-- 3. Positions
-- =========================
CREATE TABLE Positions (
    PositionID INT IDENTITY(1,1) PRIMARY KEY,
    PositionName VARCHAR(100) NOT NULL
);

-- =========================
-- 4. Candidates
-- =========================
CREATE TABLE Candidates (
    CandidateID INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    MiddleName VARCHAR(50),
    LastName VARCHAR(50) NOT NULL,
    Party VARCHAR(50),
    PositionID INT NOT NULL,
    IsActive BIT DEFAULT 1, -- For soft deletion of candidates
    FOREIGN KEY (PositionID) REFERENCES Positions(PositionID) ON DELETE CASCADE
);

-- =========================
-- 5. Votes
-- =========================
CREATE TABLE Votes (
    VoteID INT IDENTITY(1,1) PRIMARY KEY,
    VoterID BIGINT NOT NULL ,
    CandidateID INT NOT NULL,
    VoteTimestamp DATETIME DEFAULT GETDATE(),

    FOREIGN KEY (VoterID) REFERENCES Voters(VoterID),

    FOREIGN KEY (CandidateID) REFERENCES Candidates(CandidateID),

    -- Prevent duplicate votes for same candidate
    CONSTRAINT UQ_Voter_Candidate UNIQUE (VoterID, CandidateID)
);

-- =========================
-- 6. Voting System Settings
-- =========================
CREATE TABLE VotingSystemSettings (
    SettingID INT IDENTITY(1,1) PRIMARY KEY,
    SettingName VARCHAR(100) NOT NULL,
    SettingValue VARCHAR(255) NOT NULL
);


-- =========================
-- INSERTING SAMPLE DATA
-- =========================
INSERT INTO VotingSystemSettings (SettingName, SettingValue) VALUES
('VoteRelease', 0);


INSERT INTO Voters (FirstName, MiddleName, LastName, Sex, College, DateOfBirth) VALUES
('Juan','Dela','Cruz','Male','College of Engineering','2003-04-12'),
('Maria','Santos','Reyes','Female','College of Business Administration','2002-10-23'),
('Anna','Lopez','Garcia','Female','College of Arts & Sciences','2004-01-15'),
('Mark','Reyes','Delos','Male','College of Education','2003-07-08'),
('Luis','Torres','Madamba','Male','College of Computer Studies','2002-12-30'),
('Sheldon','Lee','Cooper','Male','College of Information Technology','2002-01-21'),
('admin','admin','admin','Male','College of Information Technology','2001-01-1'),
('Elena', 'Perez', 'Gilbert', 'Female', 'College of Nursing', '2004-02-14'),
('Stefan', 'Salvatore', 'Reyes', 'Male', 'College of Criminal Justice', '2001-05-23'),
('Bonnie', 'Bennett', 'Cruz', 'Female', 'College of Arts & Sciences', '2003-11-30'),
('Damon', 'Salvatore', 'Santos', 'Male', 'College of Engineering', '2002-06-18'),
('Caroline', 'Forbes', 'Dela', 'Female', 'College of Education', '2004-08-10'),
('Queenie', 'Hernandez', 'Quintero', 'Female', 'College of Education', '2001-10-24'),
('Katherine', 'Reyes', 'Sarmiento', 'Female', 'College of Nursing', '2004-04-23'),
('Lovelace', 'Ramos', 'Delos', 'Female', 'College of Criminal Justice', '2002-02-14'),
('Vincent', 'Canlas', 'Tupas', 'Female', 'College of Information Technology', '2002-10-10'),
('Coco', 'Caparas', 'Dela', 'Male', 'College of Arts & Sciences', '2000-05-15'),
('Owa', 'FBautista', 'Santos', 'Male', 'College of Education', '2006-06-10'),
('Maria', 'Sale', 'Francesca', 'Male', 'College of Business Administration', '2006-07-08');

INSERT INTO Accounts (VoterID, Email, Password, Type) VALUES
(100000000001,'juan.dc@gmail.com','pw1','user'),
(100000000002,'maria.sr@yahoo.com','pw2','user'),
(100000000003,'anna.lg@bulsu.edu.ph','pw3','user'),
(100000000004,'mark.rd@gmail.com','pw4','user'),
(100000000005,'luis.tm@bulsu.edu.ph','pw5','user'),
(100000000006,'sheldon.lc@bulsu.edu.ph','pw6','admin'),
(100000000007,'admin','admin','admin'),
(100000000008, 'elena.g@gmail.com', 'pw8', 'user'),
(100000000009, 'stefan.r@yahoo.com', 'pw9', 'user'),
(100000000010, 'bonnie.b@bulsu.edu.ph', 'pw10', 'user'),
(100000000011, 'damon.s@gmail.com', 'pw11', 'user'),
(100000000012, 'caroline.f@bulsu.edu.ph', 'pw12', 'user'),
(100000000013, 'queenie.q@bulsu.edu.ph', 'queenie', 'user'),
(100000000014, 'katherine.s@bulsu.edu.ph', 'katherine', 'user'),
(100000000015, 'lovelace.d@bulsu.edu.ph', 'lovelace', 'user'),
(100000000016, 'vincent.t@bulsu.edu.ph', 'vincent', 'user'),
(100000000017, 'coco.d@bulsu.edu.ph', 'coco', 'user'),
(100000000018, 'owa.s@bulsu.edu.ph', 'owa', 'user'),
(100000000019, 'maria.f@bulsu.edu.ph', 'maria', 'user');

INSERT INTO Positions (PositionName) VALUES
('SSC President'),
('SSC Vice President'),
('SSC Senator'),
('College Governor'),
('Campus Representative'),
('Commission on Student Elections Chair');

INSERT INTO Candidates (FirstName, MiddleName, LastName, Party, PositionID, IsActive) VALUES
('Queenie','Hernandez','Quintero','Team GOLD',1,1),
('Katherine','Reyes','Sarmiento','Team GOLD',2,0),
('Lovelace','Ramos','Delos','Team BLUE',3,1),
('Vincent','Canlas','Tupas','Team BLUE',3,0),
('Coco','Caparas','Dela','Team RED',4,0),
('Owa','Bautista','Santos','Team GREEN',5,1),
('Maria','Sale','Francesca','Team GOLD',6,1);

INSERT INTO Votes (VoterID, CandidateID) VALUES
(100000000001,1), -- Juan votes for Queenie (President)
(100000000002,2), -- Maria votes for Katherine (VP)
(100000000003,3), -- Anna votes for Lovelace (Senator)
(100000000004,4), -- Mark votes for Vincent (Senator)
(100000000005,5), -- Luis votes for Coco (Governor)
(100000000006,1), -- Sheldon votes for Queenie (President)
(100000000006,2), -- Sheldon votes for Queenie (President)
(100000000008, 1), -- Elena votes for Queenie
(100000000008, 6), -- Elena votes for Owa
(100000000009, 2), -- Stefan votes for Katherine
(100000000010, 3); -- Bonnie votes for Lovelace

-- =========================
-- SELECT QUERIES
-- =========================
--Count votes per candidate
SELECT c.FirstName, c.LastName, COUNT(v.VoteID) AS TotalVotes
FROM Candidates c
LEFT JOIN Votes v ON c.CandidateID = v.CandidateID
GROUP BY c.FirstName, c.LastName;

SELECT * FROM Positions
SELECT * FROM Voters
SELECT * FROM Candidates
SELECT * FROM Votes
SELECT * FROM Accounts
SELECT * FROM VotingSystemSettings;

--Check if voters have voted
SELECT v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth, COUNT(vo.VoterID) AS HasVoted
FROM Voters v
LEFT JOIN Votes vo ON v.VoterID = vo.VoterID
GROUP BY v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth
ORDER BY v.VoterID

--Check the winning candidates for each position
SELECT p.PositionID, p.PositionName, c.LastName, c.FirstName, c.MiddleName, COUNT(v.VoteID) AS TotalVotes 
FROM votes v 
JOIN Candidates c ON v.CandidateID = c.CandidateID 
JOIN Positions p ON c.PositionID = p.PositionID 
GROUP BY p.PositionID, p.PositionName, c.LastName, c.FirstName, c.MiddleName 
ORDER BY p.PositionID;

SELECT a.AccountID, v.VoterID, v.FirstName, v.MiddleName, v.LastName, v.Sex, v.College, v.DateOfBirth, a.Email, a.Type
FROM Voters v
JOIN Accounts a ON v.VoterID = a.VoterID

SELECT COUNT(*) AS registered_voters FROM Voters;
SELECT COUNT(*) AS total_votes FROM Votes

SELECT c.CandidateID, p.PositionName, c.LastName, c.FirstName, c.MiddleName, c.Party
FROM Candidates c
JOIN Positions p ON c.PositionID = p.PositionID
ORDER BY c.CandidateID;







--Procedures--
--Search for candidates by name (first, middle, or last)
CREATE PROCEDURE GetCandidateName
    @CandidateName VARCHAR(30)
AS
BEGIN
    SELECT c.CandidateID, p.PositionName, c.LastName, c.FirstName, c.MiddleName, c.Party, c.IsActive
    FROM Candidates c
    JOIN Positions p ON c.PositionID = p.PositionID
    WHERE c.LastName LIKE @CandidateName + '%' OR c.MiddleName LIKE @CandidateName + '%' OR c.FirstName LIKE @CandidateName + '%'
    ORDER BY c.IsActive DESC;
END

--Get all candidates with their position and active status
CREATE PROCEDURE GetCandidatesData
AS
BEGIN
    SELECT c.CandidateID, p.PositionName, c.LastName, c.FirstName, c.MiddleName, c.Party, c.IsActive
    FROM Candidates c
    JOIN Positions p ON c.PositionID = p.PositionID
    ORDER BY c.IsActive DESC;
END

--Get all voters with their voting status (whether they have voted or not)
CREATE PROCEDURE GetVotersData
AS
BEGIN
    SELECT v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth, COUNT(vo.VoterID) AS HasVoted
    FROM Voters v
    LEFT JOIN Votes vo ON v.VoterID = vo.VoterID
    GROUP BY v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth
    ORDER BY v.VoterID
END

--Search for voters by name (first, middle, or last) with their voting status
CREATE PROCEDURE SearchVoterName
    @VoterName VARCHAR(30)
AS
BEGIN
    SELECT v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth, COUNT(vo.VoterID) AS HasVoted
    FROM Voters v
    JOIN Votes vo ON v.VoterID = vo.VoterID
    WHERE v.FirstName LIKE @VoterName + '%' OR v.MiddleName LIKE @VoterName + '%' OR  v.LastName LIKE @VoterName + '%'
    GROUP BY v.VoterID, v.FirstName, v.MiddleName,v.LastName,v.Sex,v.College,v.DateOfBirth 
    ORDER BY v.VoterID
END

--Get the winning candidates for each position with their total votes
CREATE PROCEDURE GetWinningCandidates
AS
BEGIN
    SELECT p.PositionID, p.PositionName, c.LastName, c.FirstName, c.MiddleName, COUNT(v.VoteID) AS TotalVotes 
    FROM Votes v JOIN Candidates c ON v.CandidateID = c.CandidateID
    JOIN Positions p ON c.PositionID = p.PositionID
    GROUP BY p.PositionID, p.PositionName, c.LastName, c.FirstName, c.MiddleName
    ORDER BY p.PositionID
END


--Reset all tables and reseed identity to original state
DELETE FROM Votes;
DELETE FROM Candidates;
DELETE FROM Accounts;
DELETE FROM Voters;
DELETE FROM Positions;

-- Voters: starts at 100000000001
DBCC CHECKIDENT ('Voters', RESEED, 100000000000);

-- Accounts: starts at 1
DBCC CHECKIDENT ('Accounts', RESEED, 0);

-- Positions: starts at 1
DBCC CHECKIDENT ('Positions', RESEED, 0);

-- Candidates: starts at 1
DBCC CHECKIDENT ('Candidates', RESEED, 0);

-- Votes: starts at 1
DBCC CHECKIDENT ('Votes', RESEED, 0);

