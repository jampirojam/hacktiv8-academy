--
-- PostgreSQL database dump
--

-- Dumped from database version 14.3
-- Dumped by pg_dump version 14.3

-- Started on 2022-06-22 09:34:55

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE company;
--
-- TOC entry 3356 (class 1262 OID 24623)
-- Name: company; Type: DATABASE; Schema: -; Owner: jampirojam
--

CREATE DATABASE company WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_Indonesia.1252';


ALTER DATABASE company OWNER TO jampirojam;

\connect company

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 3357 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 24634)
-- Name: department; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.department (
    dnumber integer NOT NULL,
    dname character varying(15) NOT NULL,
    mgrssn character(9) NOT NULL,
    mgrstartdate date
);


ALTER TABLE public.department OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 24683)
-- Name: dependent; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.dependent (
    essn character(9) NOT NULL,
    dependent_name character varying(15) NOT NULL,
    sex character(1),
    bdate date,
    relationship character varying(8)
);


ALTER TABLE public.dependent OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 24646)
-- Name: dept_locations; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.dept_locations (
    dnum integer NOT NULL,
    dlocation character varying(15) NOT NULL
);


ALTER TABLE public.dept_locations OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 24624)
-- Name: employee; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee (
    ssn character(9) NOT NULL,
    fname character varying(15) NOT NULL,
    mname character(1),
    lname character varying(15) NOT NULL,
    bdate date,
    address character varying(30),
    sex character(1),
    salary numeric(10,2),
    superssn character(9),
    dnum integer NOT NULL
);


ALTER TABLE public.employee OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 24656)
-- Name: project; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.project (
    pnumber integer NOT NULL,
    pname character varying(15) NOT NULL,
    plocation character varying(15),
    dnum integer NOT NULL
);


ALTER TABLE public.project OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 24668)
-- Name: works_on; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.works_on (
    essn character(9) NOT NULL,
    pnum integer NOT NULL,
    hours numeric(3,1) NOT NULL
);


ALTER TABLE public.works_on OWNER TO postgres;

--
-- TOC entry 3346 (class 0 OID 24634)
-- Dependencies: 210
-- Data for Name: department; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.department (dnumber, dname, mgrssn, mgrstartdate) VALUES (1, 'HRD', 'E001     ', '2002-01-09');
INSERT INTO public.department (dnumber, dname, mgrssn, mgrstartdate) VALUES (2, 'FINANCE', 'E002     ', '2003-02-27');
INSERT INTO public.department (dnumber, dname, mgrssn, mgrstartdate) VALUES (3, 'HUMAS', 'E003     ', '2006-05-30');
INSERT INTO public.department (dnumber, dname, mgrssn, mgrstartdate) VALUES (4, 'PRODUKSI', 'E004     ', '2005-03-08');


--
-- TOC entry 3350 (class 0 OID 24683)
-- Dependencies: 214
-- Data for Name: dependent; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E001     ', 'Rita', 'F', '2005-09-18', 'DAUGHTER');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E001     ', 'Doni', 'M', '2007-01-09', 'SON');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E002     ', 'Wawan', 'M', '1984-10-23', 'HUSBAND');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E002     ', 'Roy', 'M', '2006-12-15', 'SON');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E003     ', 'Roni', 'M', '1985-08-23', 'HUSBAND');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E003     ', 'Dewi', 'F', '2006-01-01', 'DAUGHTER');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E004     ', 'Susi', 'F', '1987-09-05', 'WIFE');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E004     ', 'Rani', 'M', '2007-02-10', 'DAUGHTER');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E011     ', 'Dina', 'F', '1987-01-13', 'WIFE');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E011     ', 'Riko', 'M', '2006-03-21', 'SON');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E013     ', 'Rini', 'F', '1987-08-15', 'WIFE');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E013     ', 'Tina', 'F', '2005-12-17', 'DAUGHTER');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E014     ', 'Ayu', 'F', '1988-12-08', 'WIFE');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E014     ', 'Didiet', 'M', '2006-12-05', 'SON');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E015     ', 'Nita', 'F', '1987-01-25', 'WIFE');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E015     ', 'Serly', 'F', '1999-03-26', 'WIFE');
INSERT INTO public.dependent (essn, dependent_name, sex, bdate, relationship) VALUES ('E012     ', 'OKan', 'M', '2001-06-11', 'SON');


--
-- TOC entry 3347 (class 0 OID 24646)
-- Dependencies: 211
-- Data for Name: dept_locations; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.dept_locations (dnum, dlocation) VALUES (1, 'Darmaga');
INSERT INTO public.dept_locations (dnum, dlocation) VALUES (3, 'Darmaga');
INSERT INTO public.dept_locations (dnum, dlocation) VALUES (2, 'Darmaga');
INSERT INTO public.dept_locations (dnum, dlocation) VALUES (4, 'Baranang Siang');


--
-- TOC entry 3345 (class 0 OID 24624)
-- Dependencies: 209
-- Data for Name: employee; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E022     ', 'Lin', 'J', 'Cai', '1989-05-09', 'LOCK DOWN', 'M', 9490000.00, 'E004     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E023     ', 'Rin', NULL, 'Jincai', '1979-05-09', 'LOCK DOWN', 'M', 9190000.00, 'E011     ', 2);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E024     ', 'Mach', NULL, 'Rush', '1969-05-18', 'DOWN TOWN', 'M', 9990000.00, 'E013     ', 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E025     ', 'Dedek', NULL, 'Gembul', '1999-05-09', 'KINGDOM HEART II', 'M', 45960000.00, 'E012     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E002     ', 'Yuni', NULL, 'Arti', '1987-02-15', 'GOTHAM JELLY', 'F', 4000000.00, NULL, 2);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E004     ', 'Hanif', NULL, 'Affandi', '1987-01-21', 'GOTHAM JELLY', 'M', 4000000.00, NULL, 4);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E011     ', 'Yuhan', 'A', 'Kusuma', '1987-03-16', 'GOTHAM JELLY', 'M', 2500000.00, 'E002     ', 2);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E015     ', 'Herbet', NULL, 'Sianipar', '1987-07-16', 'GOTHAM JELLY', 'M', 3750000.00, 'E003     ', 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E020     ', 'Rojam', 'G', 'Sih', '1986-08-19', 'GOTHAM JELLY', 'M', 7400000.00, 'E003     ', 4);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E019     ', 'Aliyah', 'S', 'Mush', '1996-08-19', 'MOCKING BIRD', 'F', 3400000.00, 'E001     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E001     ', 'Hakim', NULL, 'Arifin', '1987-01-12', 'KINKY SENKY SIMILIKITY', 'M', 4000000.00, NULL, 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E003     ', 'Mutia', NULL, 'Aziza', '1987-03-23', 'KINKY SENKY SIMILIKITY', 'F', 4000000.00, NULL, 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E007     ', 'Rifki', 'Y', 'Haidar', '1987-08-02', 'KINKY SENKY SIMILIKITY', 'M', 3000000.00, 'E001     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E010     ', 'Andi', NULL, 'Sasmita', '1987-02-15', 'KINKY SENKY SIMILIKITY', 'M', 3000000.00, 'E002     ', 2);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E012     ', 'Ferdian', NULL, 'Feisal', '1987-03-23', 'KINKY SENKY SIMILIKITY', 'M', 2000000.00, 'E002     ', 2);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E017     ', 'Rickson', 'W', 'Fernando', '1997-05-09', 'ORBA 2.0 BETA VERSION', 'M', 9000000.00, 'E003     ', 2);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E006     ', 'Pritasri', NULL, 'Palupiningsih', '1987-12-09', 'ORBA 2.0 BETA VERSION', 'F', 3500000.00, 'E001     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E014     ', 'Benedika', 'F', 'Hutabarat', '1987-06-21', 'ORBA 2.0 BETA VERSION', 'M', 3250000.00, 'E003     ', 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E008     ', 'Muhammad', 'A', 'Rosyidi', '1987-06-22', 'ORBA 2.0 BETA VERSION', 'M', 2750000.00, 'E001     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E016     ', 'Ferguso', NULL, 'OTidakBisa', '1998-09-16', 'MOCKING BIRD', 'M', 5750000.00, 'E003     ', 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E005     ', 'Vera', NULL, 'Yunita', '1987-05-16', 'MOCKING BIRD', 'F', 3500000.00, 'E001     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E018     ', 'Machrush', 'A', 'Siro', '1987-05-04', 'KINGDOM HEART II', 'M', 19000000.00, 'E007     ', 1);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E021     ', 'Ryu', 'J', 'Kan', '1976-01-11', 'KINGDOM HEART II', 'M', 7400000.00, 'E003     ', 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E013     ', 'Albertus', 'A', 'M', '1986-05-22', 'KINGDOM HEART II', 'M', 3000000.00, 'E003     ', 3);
INSERT INTO public.employee (ssn, fname, mname, lname, bdate, address, sex, salary, superssn, dnum) VALUES ('E009     ', 'Ferry', NULL, 'Pratama', '1987-07-11', 'KINGDOM HEART II', 'M', 3000000.00, 'E002     ', 2);


--
-- TOC entry 3348 (class 0 OID 24656)
-- Dependencies: 212
-- Data for Name: project; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (1, 'AAA', 'Bogor', 1);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (2, 'BBB', 'Jakarta', 2);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (3, 'CCC', 'Tangerang', 2);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (4, 'DDD', 'Bekasi', 2);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (5, 'EEE', 'Depok', 3);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (6, 'FFF', 'Bogor', 3);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (7, 'GGG', 'Tangerang', 4);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (8, 'HHH', 'Jakarta', 4);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (9, 'III', 'Jakarta', 2);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (10, 'JJJ', 'Gresik', 2);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (11, 'KKK', 'Surabaya', 1);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (12, 'LLL', 'Surabaya', 3);
INSERT INTO public.project (pnumber, pname, plocation, dnum) VALUES (13, 'MMM', 'Gresik', 2);


--
-- TOC entry 3349 (class 0 OID 24668)
-- Dependencies: 213
-- Data for Name: works_on; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E001     ', 1, 90.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E001     ', 2, 98.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E002     ', 2, 55.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E002     ', 3, 78.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E003     ', 3, 53.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E003     ', 4, 77.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E004     ', 4, 77.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E004     ', 5, 98.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E004     ', 7, 85.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E004     ', 8, 68.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E005     ', 5, 57.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E005     ', 6, 87.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E006     ', 7, 45.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E006     ', 6, 87.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E007     ', 7, 40.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E007     ', 8, 88.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E008     ', 1, 78.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E008     ', 8, 87.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E009     ', 1, 88.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E009     ', 2, 65.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E010     ', 2, 34.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E010     ', 3, 78.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E011     ', 1, 68.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E011     ', 3, 88.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E012     ', 4, 55.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E012     ', 1, 33.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E013     ', 2, 96.0);
INSERT INTO public.works_on (essn, pnum, hours) VALUES ('E013     ', 9, 80.0);


--
-- TOC entry 3198 (class 2606 OID 24687)
-- Name: dependent dependent_essn_depname_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependent
    ADD CONSTRAINT dependent_essn_depname_pk PRIMARY KEY (essn, dependent_name);


--
-- TOC entry 3186 (class 2606 OID 24640)
-- Name: department dept_dname_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT dept_dname_unique UNIQUE (dname);


--
-- TOC entry 3188 (class 2606 OID 24638)
-- Name: department dept_dnumber_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT dept_dnumber_pk PRIMARY KEY (dnumber);


--
-- TOC entry 3190 (class 2606 OID 24650)
-- Name: dept_locations dnumber_dlocation_pf; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dept_locations
    ADD CONSTRAINT dnumber_dlocation_pf PRIMARY KEY (dnum, dlocation);


--
-- TOC entry 3184 (class 2606 OID 24628)
-- Name: employee employee_ssn_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_ssn_pk PRIMARY KEY (ssn);


--
-- TOC entry 3192 (class 2606 OID 24662)
-- Name: project project_pname_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.project
    ADD CONSTRAINT project_pname_unique UNIQUE (pname);


--
-- TOC entry 3194 (class 2606 OID 24660)
-- Name: project project_pnumber_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.project
    ADD CONSTRAINT project_pnumber_pk PRIMARY KEY (pnumber);


--
-- TOC entry 3196 (class 2606 OID 24672)
-- Name: works_on works_essn_pnum_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT works_essn_pnum_pk PRIMARY KEY (essn, pnum);


--
-- TOC entry 3205 (class 2606 OID 24688)
-- Name: dependent dependent_essn_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dependent
    ADD CONSTRAINT dependent_essn_fk FOREIGN KEY (essn) REFERENCES public.employee(ssn);


--
-- TOC entry 3200 (class 2606 OID 24641)
-- Name: department dept_mgrssn_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.department
    ADD CONSTRAINT dept_mgrssn_fk FOREIGN KEY (mgrssn) REFERENCES public.employee(ssn) ON DELETE CASCADE;


--
-- TOC entry 3201 (class 2606 OID 24651)
-- Name: dept_locations dloc_dnum_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.dept_locations
    ADD CONSTRAINT dloc_dnum_fk FOREIGN KEY (dnum) REFERENCES public.department(dnumber);


--
-- TOC entry 3199 (class 2606 OID 24629)
-- Name: employee employee_superssn_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_superssn_fk FOREIGN KEY (superssn) REFERENCES public.employee(ssn) ON DELETE CASCADE;


--
-- TOC entry 3202 (class 2606 OID 24663)
-- Name: project project_dnum_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.project
    ADD CONSTRAINT project_dnum_fk FOREIGN KEY (dnum) REFERENCES public.department(dnumber) ON DELETE CASCADE;


--
-- TOC entry 3203 (class 2606 OID 24673)
-- Name: works_on works_essn_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT works_essn_fk FOREIGN KEY (essn) REFERENCES public.employee(ssn) ON DELETE CASCADE;


--
-- TOC entry 3204 (class 2606 OID 24678)
-- Name: works_on works_pnum_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.works_on
    ADD CONSTRAINT works_pnum_fk FOREIGN KEY (pnum) REFERENCES public.project(pnumber) ON DELETE CASCADE;


--
-- TOC entry 3358 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

GRANT ALL ON SCHEMA public TO jampirojam;


-- Completed on 2022-06-22 09:34:55

--
-- PostgreSQL database dump complete
--
