USE GreenDriveHun;

CREATE TABLE Mechanic (

	MechanicID INT NOT NULL AUTO_INCREMENT,
    Name VARCHAR (125) NOT NULL,
    CompanyName VARCHAR (125) NOT NULL,
    CompanyNumber VARCHAR (125) NOT NULL,
    Email VARCHAR (125) NOT NULL,
    Password VARCHAR (125) NOT NULL,
    About TEXT, 
    UploadedImages BLOB, 
 
	PRIMARY KEY (MechanicID),
    UNIQUE (CompanyName),
    UNIQUE (CompanyNumber)
    
);