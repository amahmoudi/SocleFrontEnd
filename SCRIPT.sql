create table APP_USER (
`ID` int(11) NOT NULL AUTO_INCREMENT,
`SSO_ID` varchar(100) NOT NULL ,
PASSWORD varchar(100),
FIRST_NAME varchar(100),
LAST_NAME varchar(100),
EMAIL varchar(100),
USER_PROFILE_ID int(11),
primary key (id)
);

create table PERSISTENT_LOGINS (
series  varchar(100),
USERNAME varchar(100),
TOKEN varchar(100),
last_used timestamp,
primary key (series)
);

create table USER_PROFILE (
`ID` int(11) NOT NULL ,
TYPE varchar(100),
primary key (id)
);



