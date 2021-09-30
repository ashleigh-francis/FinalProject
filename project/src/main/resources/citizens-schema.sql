
drop table if exists citizen CASCADE;

create table citizen
(
	citizenID bigint PRIMARY KEY,
	forenames varchar(100),
	surname varchar(100),
	homeAddress varchar(200),
	dateOfBirth date,
	placeOfBirth varchar(200),
	sex varchar(50)
);

drop table if exists vehicle_registration CASCADE;

create table vehicle_registration
(
	registrationID integer PRIMARY KEY,
	registrationDate varchar(100),
	vehicleRegistrationNo varchar(100),
	make varchar(100),
	model varchar(100),
	colour varchar(100),
	forenames varchar(100),
	surname varchar(100),
	address varchar(100),
	dateOfBirth varchar(50),
	driverLicenceID varchar(150)
);

drop table if exists people_business_address CASCADE;

create table people_business_address
(
	personName varchar(150) PRIMARY KEY,
	homeAddress varchar(150),
	dateOfBirth varchar(100),
	businessName varchar(200),
	businessAddress varchar(200)
);

drop table if exists people_mobile CASCADE;

create table people_mobile
(
	forenames varchar(100),
	surname varchar(100),
	dateOfBirth date(100),
	address varchar(200),
	town varchar(100),
	postcode varchar(50),
	phoneNumber varchar(50),
	network varchar(50),
	id int PRIMARY KEY AUTO_INCREMENT
);

drop table if exists people_bank_account CASCADE;

create table people_bank_account
(
	bankAccountId integer(100) PRIMARY KEY,
	accountNumber bigint(150),
	bank varchar(100),
	forenames varchar(100),
	surname varchar(100),
	dateOfBirth varchar(100),
	homeAddress varchar(200)
);

drop table if exists bank_card CASCADE;

create table bank_card
(
	bankCardId integer(100) PRIMARY KEY,
	cardNumber bigint(100),
	sortCode varchar(100),
	bankAccountId integer(50),
	accountNumber bigint(50),
	bank varchar(100)
);

drop table if exists atm_transaction CASCADE;

create table atm_transaction
(
	timestamp varchar(100),
	atmId integer(50),
	bankCardNumber bigint(100),
	type varchar(100),
	amount integer(25),
	id int PRIMARY KEY AUTO_INCREMENT
);

drop table if exists vehicle_observations CASCADE;

create table vehicle_observations
(
	ANPRPointId integer(50) PRIMARY KEY,
	timestamp varchar(100),
	vehicleRegistrationNumber varchar(100)
);

drop table if exists anpr_camera CASCADE;

create table anpr_camera
(
	anprId integer(50),
	streetName varchar(100),
	latitude decimal(30,25),
	longitude decimal(30,25)
);

drop table if exists atm_point CASCADE;

create table atm_point
(
	atmId integer(50) PRIMARY KEY,
	operator varchar(100),
	streetName varchar(100),
	postcode varchar(50),
	latitude decimal(30,25),
	longitude decimal (30,25)
);

drop table if exists epos_transactions CASCADE;

create table epos_transactions
(
	timestamp varchar(50),
	eposId integer(25),
	bankCardNumber bigint(50),
	payeeAccount bigint(50),
	amount decimal(10,5),
	tableId integer PRIMARY KEY AUTO_INCREMENT
);

drop table if exists epos CASCADE;

create table epos
(
	id integer(50),
	vendor varchar(50),
	streetName varchar(100),
	postcode varchar(50),
	latitude decimal(30,25),
	longitude decimal(30,25),
	tableId integer(50) PRIMARY KEY AUTO_INCREMENT
);

drop table if exists cell_tower CASCADE;
	
create table cell_tower
(
	cellTowerId integer,
	operator varchar(50),
	type varchar(50),
	latitude decimal(30,25),
	longitude decimal(30,25),
	tableId integer PRIMARY KEY AUTO_INCREMENT
);

drop table if exists mobile_call_records CASCADE;
	
create table mobile_call_records
(
	timestamp varchar(50),
	callerMSISDN varchar(50),
	callCellTowerId integer(25),
	receiverMSISDN varchar(50),
	receiverTowerId integer,
	tableId integer PRIMARY KEY AUTO_INCREMENT
);

drop table if exists passport CASCADE;
	
create table passport
(
	passportNumber bigint PRIMARY KEY,
	surname varchar(50),
	givenName varchar(50),
	nationality varchar(10),
	dob date,
	sex varchar(25),
	placeOfBirth varchar(50),
	issuingCountry varchar(75),
	dateOfIssue date,
	dateOfExpiry date
);

drop table if exists users CASCADE;

create table users
(
	id integer PRIMARY KEY AUTO_INCREMENT,
	username varchar(50),
	passwrd varchar(50)
);