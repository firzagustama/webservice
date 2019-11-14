CREATE TABLE karyawan (
    kode CHAR(5) PRIMARY KEY,
    nama VARCHAR(255),
    alamat TEXT,
    phone VARCHAR(12)
);

CREATE TABLE jadwal (
    kode CHAR(5) PRIMARY KEY,
    materi VARCHAR(255),
    tanggal DATE,
    lokasi INTEGER,
    session TINYINT
);

CREATE TABLE nilai (
    kode_karyawan CHAR(5),
    kode_jadwal CHAR(5),
    nilai INTEGER,
    PRIMARY KEY (kode_karyawan, kode_jadwal),
    FOREIGN KEY (kode_karyawan) REFERENCES karyawan(kode) ON UPDATE CASCADE,
    FOREIGN KEY (kode_jadwal) REFERENCES jadwal(kode) ON UPDATE CASCADE
)

INSERT INTO karyawan
VALUES
	('PEG01', 'Yohana', 'Jakarta', '12345'),
	('PEG02', 'Yohane', 'Palembang', '23456'),
	('PEG03', 'Yohani', 'Medan', '34567'),
	('PEG04', 'Yohano', 'Surabaya', '45678'),
	('PEG05', 'Yohano', 'Malang', '56789');

INSERT INTO jadwal
VALUES
    ('JAD01', 'Algoritma', '2019-10-31', 711, 3),
    ('JAD02', 'Spring Boot', '2019-11-12', 724, 2),
    ('JAD03', 'Android', '2019-11-23', 728, 2),
    ('JAD04', 'Phyton', '2019-10-31', 706, 4),
    ('JAD05', 'Ajax', '2019-10-31', 711, 1);

INSERT INTO nilai
VALUES
    ('PEG01', 'JAD01', 86),
    ('PEG01', 'JAD02', 88),
    ('PEG01', 'JAD03', 89),
    ('PEG01', 'JAD04', 90),
    ('PEG02', 'JAD02', 78),
    ('PEG02', 'JAD03', 89),
    ('PEG02', 'JAD04', 77),
    ('PEG03', 'JAD03', 88),
    ('PEG03', 'JAD04', 89),
    ('PEG03', 'JAD05', 90),
    ('PEG04', 'JAD02', 89),
    ('PEG04', 'JAD03', 77),
    ('PEG04', 'JAD04', 88),
    ('PEG04', 'JAD05', 88),
    ('PEG05', 'JAD01', 89),
    ('PEG05', 'JAD02', 90),
    ('PEG05', 'JAD03', 100);