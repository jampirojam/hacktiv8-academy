--
-- PostgreSQL database dump
--

-- Dumped from database version 14.3
-- Dumped by pg_dump version 14.3

-- Started on 2022-06-22 10:11:29

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
-- TOC entry 3331 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 24606)
-- Name: album; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.album (
    id_album integer NOT NULL,
    tgl_copyright date NOT NULL,
    format character varying(50) NOT NULL,
    judul character varying(50) NOT NULL
);


ALTER TABLE public.album OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 24616)
-- Name: instrument; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.instrument (
    nama character varying NOT NULL,
    kunci_musik character varying NOT NULL
);


ALTER TABLE public.instrument OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 24611)
-- Name: lagu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.lagu (
    judul character varying(50) NOT NULL,
    pengarang character varying(50) NOT NULL,
    ssn integer NOT NULL
);


ALTER TABLE public.lagu OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 24601)
-- Name: musisi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.musisi (
    ssn integer NOT NULL,
    nama character varying(50) NOT NULL,
    alamat character varying(50),
    no_telp character varying(50) NOT NULL,
    id_album integer NOT NULL
);


ALTER TABLE public.musisi OWNER TO postgres;

--
-- TOC entry 3323 (class 0 OID 24606)
-- Dependencies: 210
-- Data for Name: album; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.album (id_album, tgl_copyright, format, judul) FROM stdin;
1	2022-06-17	Digital Album\n	New Era\n
6	2020-01-03	Compact Disk	Melela Rasa
2	2017-09-08	Digital Album	Gaya Jongkok
3	2011-11-11	Compact Disk	Enak Naik Apa Turun?
4	2022-02-02	Digital Album	Flying Fox
5	2022-06-17	Digital Album	New Era!
\.


--
-- TOC entry 3325 (class 0 OID 24616)
-- Dependencies: 212
-- Data for Name: instrument; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.instrument (nama, kunci_musik) FROM stdin;
Gitar	Mayor
Triangle\n	Minor
Tifa	Mayor
Piano	Minor
Seruling	Mayor
Drum	Mayor
\.


--
-- TOC entry 3324 (class 0 OID 24611)
-- Dependencies: 211
-- Data for Name: lagu; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.lagu (judul, pengarang, ssn) FROM stdin;
Kucumbu Rayu Tubuh Indahku	Fajar Nugros	1
Flying High	Aki Aki\n	2
Aku Nelongso	Didi Kemplo	3
\.


--
-- TOC entry 3322 (class 0 OID 24601)
-- Dependencies: 209
-- Data for Name: musisi; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.musisi (ssn, nama, alamat, no_telp, id_album) FROM stdin;
1	Fajar Nugros	Jakarta	089000001	2
2	Shani Indira Natio	Yogyakarta\n	087000001	5
3	Tan Zhi Hui Celine	Kuala Lumpur	088000001	3
4	Efek Kuroptor	Jakarta	081000001	1
\.


--
-- TOC entry 3178 (class 2606 OID 24610)
-- Name: album album_id_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.album
    ADD CONSTRAINT album_id_pk PRIMARY KEY (id_album);


--
-- TOC entry 3180 (class 2606 OID 24615)
-- Name: lagu lagu_judul_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.lagu
    ADD CONSTRAINT lagu_judul_pk PRIMARY KEY (judul);


--
-- TOC entry 3176 (class 2606 OID 24605)
-- Name: musisi musisi_ssn_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.musisi
    ADD CONSTRAINT musisi_ssn_pk PRIMARY KEY (ssn);


--
-- TOC entry 3182 (class 2606 OID 24622)
-- Name: instrument nama_instrument; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.instrument
    ADD CONSTRAINT nama_instrument PRIMARY KEY (nama);


-- Completed on 2022-06-22 10:11:29

--
-- PostgreSQL database dump complete
--

