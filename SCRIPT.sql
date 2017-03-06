create table APP_USER (
`ID` int(11) NOT NULL AUTO_INCREMENT,
`SSO_ID` varchar(100) NOT NULL ,
PASSWORD varchar(100),
FIRST_NAME varchar(100),
LAST_NAME varchar(100),
EMAIL varchar(100),
primary key (id)
);

create table PERSISTENT_LOGINS (
`ID` int(11) NOT NULL AUTO_INCREMENT,
series  varchar(100),
USERNAME varchar(100),
TOKEN varchar(100),
last_used timestamp,
primary key (id)
);

create table USER_PROFILE (
`ID` int(11) NOT NULL AUTO_INCREMENT,
TYPE varchar(100),
primary key (id)
);

create table APP_USER_USER_PROFILE (
  `USER_ID` int(10) unsigned NOT NULL,
  `USER_PROFILE_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`USER_ID`,`USER_PROFILE_ID`)
);

insert into APP_USER(`ID` ,`SSO_ID` ,PASSWORD ,FIRST_NAME ,LAST_NAME ,EMAIL )values(1,'admin','admin','abdelbaki','mahmoudi','abdelbaki.mahmoudi@gmail.com');
insert into PERSISTENT_LOGINS(`ID` ,`series` ,USERNAME ,TOKEN ,last_used )values(1,'admin','admin','admin@123','12/12/2016');
insert into USER_PROFILE(`ID` ,`TYPE`  )values(1,'ADMIN');
insert into APP_USER_USER_PROFILE(`USER_ID` ,`USER_PROFILE_ID`  )values(1,1);