DROP TABLE IF EXISTS onetime_tokens;

CREATE TABLE onetime_tokens
(
	id int NOT NULL,
	pre_entry_id int NOT NULL,
	token varchar(255),
	limited_date datetime,
	create_date datetime NOT NULL,
	update_date datetime,
	PRIMARY KEY (id)
);

ALTER TABLE onetime_tokens
	ADD FOREIGN KEY (pre_entry_id)
	REFERENCES pre_entries (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


