DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS onlineaccounts;

CREATE TABLE accounts (
  userid INT(250) NOT NULL PRIMARY KEY,
  password VARCHAR(250) NOT NULL
);


CREATE TABLE onlineaccounts
(
  userid INT(250) NOT NULL PRIMARY KEY,
  password VARCHAR(250) NOT NULL
);

INSERT INTO accounts (userid, password ) VALUES ('123456789', '442323323');
INSERT INTO accounts (userid, password ) VALUES ('12323', '2321312321');
INSERT INTO accounts (userid, password ) VALUES ('21321323', '123121232');

