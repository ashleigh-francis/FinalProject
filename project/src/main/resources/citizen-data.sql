insert into `citizen` 
	( `citizenID`, `forenames`, `surname`, `homeAddress`, `dateOfBirth`, `placeOfBirth`, `sex`) 
values
	 (1, 'Christian', 'Window', '123 made up street', 05/11/1993, 'Chelmsford', 'Male'),
	 (2, 'Charlotte', 'Cartwright', '123 even more made up street', 01/01/2005, 'Wonderland', 'Female');
	 
insert into `vehicle_registration` 
	( `registrationID`, `registrationDate`, `vehicleRegistrationNo`, `make`, `model`, `colour`, `forenames`, `surname`, `address`, `dateOfBirth`, `driverLicenseID`) 
values
	 (1, 'Sometime', 'AB1 CD2', 'Maserati', 'SomethingOrOther', 'Red', 'Christian', 'Window', '123 made up street', 05/11/1993, '67im2omi562o4m1'),
	 (2, '01/02/2003', 'EF3 GH4', 'Bugatti', 'Veyron', 'Blue', 'Charlotte', 'Cartwright', '123 even more made up street', 01/01/2005, '1kfoim23456om56');
	 
insert into `people_business_address` 
	( `personsName`, `homeAddress`, `dateOfBirth`, `businessName`, `businessAddress`) 
values
	 ('Chris', 'Chris House', 05/11/1993, 'Chris's Business', 'chris's Business address'),
	 ('Charlotte', 'Charlotte House', 01/02/2003, 'Charlotte's Business', 'Charlotte's Business Address');
	 
insert into `people_mobile` 
	( `forenames`, `surname`, `dateOfBirth`, `address`, `town`, `postcode`, `phoneNumber`, `network`) 
values
	 ('Chris', 'Window', 05/11/1993, 'Chris's Address', 'chris's town', 'Chris's postcode', '07912345678', 'EE'),
	 ('Charlotte', 'Cartwright', 01/01/2005, 'Charlotte's Address', 'Charlotte's town', 'Charlotte's postcode', '07998765432', 'Tmobile';
	 
	 
insert into `people_bank_account` 
	( `bankAccountId`, `accountNumber`, `bank`, `forenames`, `surname`, `dateOfBirth`, `homeAddress`) 
values
	 (1, 123456789101112, 'HSBC', 'Chris', 'Window', 05/11/1993, '123 made up street'),
	 (2, 987654321012345, 'Charlotte's Bank', 'Charlotte', 'Cartwright', 01/01/2005, 'Charlotte's House';
	 
insert into `bank_card` 
	( `bankCardId`, `cardNumber`, `sortCode`, `bankAccountId`, `accountNumber`, `bank`) 
values
	 (1, 123456789101112, '11-11-11', 123456789, 123456789101112, 'HSBC'),
	 (2, 987654321012345, '22-22-22', 987654321, 987654321012345, 'Charlotte's Bank');
	 
insert into `atm_transaction` 
	( `timestamp`, `atmId`, `bankCardNumber`, `type`, `amount`) 
values
	 ('10/10/2010@T13:15:10', 1, 123456789101112, 'cash withdrawal', 50.50),
	 ('11/10/2010@T13:15:10', 2, 987654321012345, 'cash withdrawal', 50.75);
	 
insert into `vehicle_observations` 
	( `ANPRPointId`, `timestamp`, `vehicleRegistrationNumber`) 
values
	 (1, '2015-05-01T09:08:51.975', 'AB1 CD2'),
	 (2, '2015-05-01T09:08:51.990', 'EF3 GH4');
	 
insert into `anpr_camera` 
	( `anprId`, `streetName`, `latitude`, `longitude`) 
values
	 (1, 'Stafford Road, A34', 52.70225113709832,-2.0368518763076935),
	 (2, 'Evelix Road, A949', 57.88098926576203,-4.034929812735241);
	 
insert into `atm_point` 
	( `atmId`, `operator`, `streetName`, `postcode`, `latitude`, longitude`) 
values
	 (1, `Clydesdale Bank`, 'Stafford Road, A34', `HP5 1FE`, 51.7045445304116, -0.612916592575059),
	 (2, `Lloyds Bank and TSB`, 'Evelix Road, A949', `HP6 1DE`, 51.9416888735662, -0.881871992563587);
	 
insert into `epos_transactions` 
	( `timestamp`, `eposId`, `bankCardNumber`, `payeeAccount`, `amount`) 
values
	 ('10/10/2010@T10:15:15', `1`, 123456789101112, 123456789101112, 50.25),
	 ('11/11/2011@T10:33:33', `2`, 987654321012345, 987654321012345, 50.15);
	 
insert into `epos` 
	( `id`, `vendor`, `streetName`, `postcode`,`latitude`, `longitude`) 
values
	 (1, 'Al Safi Mini Market', 'Holland Park Road', 'W14 8NZ', 51.4985742625977, -0.201958730105688),
	 (2, 'Water And Gas', 'Kensington High Street, A315', 'W8  6LP', 51.4981665587725, -0.20118236563939);
	 
insert into `cell_tower` 
	( `cellTowerId`, `operator`, `type`, `latitude`, `longitude`) 
values
	 (1, 'Airwave', 'TETRA', 51.3883167417014, -2.33367232628084),
	 (2, 'Airwave', 'TETRA', 51.2152647703403, -2.89408597291609);
	 
insert into `mobile_call_records` 
	( `timestamp`, `callerMSISDN`, `callCellTowerId`, `receiverMSISDN`, `receiverTowerId`) 
values
	 ('2015-05-01T09:08:51.970', '07700 988518', 140391, '07700 801501', 104552),
	 ('2015-05-01T09:08:52.070', '07700 801501', 140743, '07700 988518', 104552);
	 
insert into `passport` 
	( `passportNumber`, `surname`, `givenName`, `nationality`, `dob`, `sex`, `placeOfBirth`, `issuingCountry`, `dateOfIssue`, `dateOfExpiry`) 
values
	 (355635965, 'Window', 'Christian', 'GBR', 05/11/1993, 'Male', 'LONDON', 'GBR', '2008-01-12','2018-01-12'),
	 (177458963, 'Cartwright', 'Charlotte', 'GBR', 01/01/2005, 'Female', 'Gloucster', 'GBR', '2008-01-12','2018-01-12');
	 
insert into `users` 
	( `passportNumber`, `surname`, `givenName`) 
values
	 (, 'admin', 'Dark27!'),
	 (, 'administrator', 'Light18!');


-- can't use " " with H2 databases
-- If you see something like: 'column "x" not found' you've used " "