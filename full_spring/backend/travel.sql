# DROP TABLE IF EXISTS tbl_travel;
# CREATE TABLE tbl_travel
# (
#     no INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
#     district VARCHAR(50) NOT NULL,
#     title VARCHAR(512) NOT NULL,
#     description TEXT,
#     address VARCHAR(512),
#     phone VARCHAR(256)
# );


# select * from tbl_travel;

# DROP TABLE IF EXISTS tbl_travel;
# CREATE TABLE tbl_travel
# (
#     no INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
#     district VARCHAR(50) NOT NULL,
#     title VARCHAR(512) NOT NULL,
#     description TEXT,
#     address VARCHAR(512),
#     phone VARCHAR(256)
# );



DROP TABLE IF EXISTS tbl_travel_image;
CREATE TABLE tbl_travel_image
(
    no INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    filename VARCHAR(512) NOT NULL,
    travel_no INT,
    CONSTRAINT FOREIGN KEY (travel_no) REFERENCES tbl_travel (no)
        ON DELETE CASCADE
);


select t.*, ti.no as tino, ti.filename, ti.travel_no
from tbl_travel t
         left outer join tbl_travel_image ti
                       on t.no = ti.travel_no
where t.no = 1;


