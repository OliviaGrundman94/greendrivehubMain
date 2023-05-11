USE GreenDriveHub;

CREATE TABLE User (

	UserID INT NOT NULL auto_increment,
    FirstName VARCHAR (125) NOT NULL,
    LastName VARCHAR (125) NOT NULL,
    TelephoneNumber VARCHAR (125) NOT NULL,
    EmailAddress VARCHAR (250) NOT NULL, 
    UserName VARCHAR (50) NOT NULL,
    Password VARCHAR (50) NOT NULL, 
    
    primary key (UserID),
	unique (UserName)
    
);