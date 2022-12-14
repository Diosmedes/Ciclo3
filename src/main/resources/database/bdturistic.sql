PGDMP                     	    z         
   bdturistic    13.8    13.8     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    16395 
   bdturistic    DATABASE     n   CREATE DATABASE bdturistic WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
    DROP DATABASE bdturistic;
                postgres    false            ?            1259    16399    alquiler    TABLE     ?   CREATE TABLE public.alquiler (
    idalquiler integer NOT NULL,
    fechaingreso character varying(255),
    fechasalida character varying(255),
    idcliente integer,
    idfinca integer,
    valorpagar bigint
);
    DROP TABLE public.alquiler;
       public         heap    postgres    false            ?            1259    16396    cliente    TABLE     ?   CREATE TABLE public.cliente (
    idcliente integer NOT NULL,
    apellido character varying(255),
    correo character varying(255),
    nombre character varying(255),
    password character varying(255),
    usuario character varying(255)
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            ?            1259    16410    finca    TABLE        CREATE TABLE public.finca (
    idfinca integer NOT NULL,
    "nbaños" character varying(255),
    nhabitaciones character varying(255),
    tipo character varying(255),
    ubicacion character varying(255),
    zonasrecreativas character varying(255)
);
    DROP TABLE public.finca;
       public         heap    postgres    false            ?          0    16399    alquiler 
   TABLE DATA           i   COPY public.alquiler (idalquiler, fechaingreso, fechasalida, idcliente, idfinca, valorpagar) FROM stdin;
    public          postgres    false    201          ?          0    16396    cliente 
   TABLE DATA           Y   COPY public.cliente (idcliente, apellido, correo, nombre, password, usuario) FROM stdin;
    public          postgres    false    200   !       ?          0    16410    finca 
   TABLE DATA           e   COPY public.finca (idfinca, "nbaños", nhabitaciones, tipo, ubicacion, zonasrecreativas) FROM stdin;
    public          postgres    false    202   r       ,           2606    16406    alquiler alquiler_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.alquiler
    ADD CONSTRAINT alquiler_pkey PRIMARY KEY (idalquiler);
 @   ALTER TABLE ONLY public.alquiler DROP CONSTRAINT alquiler_pkey;
       public            postgres    false    201            .           2606    16417    finca finca_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.finca
    ADD CONSTRAINT finca_pkey PRIMARY KEY (idfinca);
 :   ALTER TABLE ONLY public.finca DROP CONSTRAINT finca_pkey;
       public            postgres    false    202            ?      x?????? ? ?      ?   A   x?340?43667??IM/?LT??/H?????t?K)JMT???H?K?4426?LL????????? ??      ?      x?????? ? ?     