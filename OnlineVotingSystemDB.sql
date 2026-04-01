CREATE DATABASE OnlineVotingSystem;
USE OnlineVotingSystem

CREATE LOGIN voting_database
WITH PASSWORD = 'admin123';

CREATE USER voting_database FOR LOGIN voting_database;
GRANT SELECT, INSERT, UPDATE, DELETE ON SCHEMA::dbo TO voting_database;
REVOKE SELECT, INSERT, UPDATE, DELETE ON SCHEMA::dbo TO voting_database;
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

INSERT INTO Voters (FirstName, MiddleName, LastName, Sex, College, DateOfBirth) VALUES
('Juan','Dela','Cruz','Male','College of Engineering','2003-04-12'),
('Maria','Santos','Reyes','Female','College of Business Administration','2002-10-23'),
('Anna','Lopez','Garcia','Female','College of Arts & Sciences','2004-01-15'),
('Mark','Reyes','Delos','Male','College of Education','2003-07-08'),
('Luis','Torres','Madamba','Male','College of Computer Studies','2002-12-30'),
('Sheldon','Lee','Cooper','Male','College of Information Technology','2002-01-21');

INSERT INTO Accounts (VoterID, Email, Password) VALUES
(100000000001,'juan.dc@gmail.com','pw1'),
(100000000002,'maria.sr@yahoo.com','pw2'),
(100000000003,'anna.lg@bulsu.edu.ph','pw3'),
(100000000004,'mark.rd@gmail.com','pw4'),
(100000000005,'luis.tm@bulsu.edu.ph','pw5'),
(100000000006,'sheldon.lc@bulsu.edu.ph','pw6');

INSERT INTO Positions (PositionName) VALUES
('SSC President'),
('SSC Vice President'),
('SSC Senator'),
('College Governor'),
('Campus Representative'),
('Commission on Student Elections Chair');

INSERT INTO Candidates (FirstName, MiddleName, LastName, Party, PositionID) VALUES
('Queenie','Hernandez','Quintero','Team GOLD',1),
('Katherine','Reyes','Sarmiento','Team GOLD',2),
('Lovelace','Ramos','Delos','Team BLUE',3),
('Vincent','Canlas','Tupas','Team BLUE',3),
('Coco','Caparas','Dela','Team RED',4),
('Owa','Bautista','Santos','Team GREEN',5),
('Maria','Sale','Francesca','Team GOLD',6);

INSERT INTO Votes (VoterID, CandidateID) VALUES
(100000000001,1), -- Juan votes for Queenie (President)
(100000000002,2), -- Maria votes for Katherine (VP)
(100000000003,3), -- Anna votes for Lovelace (Senator)
(100000000004,4), -- Mark votes for Vincent (Senator)
(100000000005,5), -- Luis votes for Coco (Governor)
(100000000006,1), -- Sheldon votes for Queenie (President)
(100000000006,2); -- Sheldon votes for Queenie (President)

--Count votes per candidate
SELECT c.FirstName, c.LastName, COUNT(v.VoteID) AS TotalVotes
FROM Candidates c
LEFT JOIN Votes v ON c.CandidateID = v.CandidateID
GROUP BY c.FirstName, c.LastName;

SELECT * FROM Votes

SELECT * FROM Candidates
SELECT * FROM Voters
SELECT * FROM Accounts

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