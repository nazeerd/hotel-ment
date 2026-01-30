CREATE TABLE IF NOT EXISTS public.menu_item
(
    is_ready boolean NOT NULL,
    price integer,
    type integer,
    id SERIAL PRIMARY KEY,
    description character varying(1800) ,
    hotel_unique_no character varying(255) ,
    name character varying(255)
);

CREATE TABLE IF NOT EXISTS public.hotel_details
(
    id SERIAL PRIMARY KEY,
    address character varying(255) ,
    name character varying(255) ,
    owner_name character varying(255) ,
    owner_number character varying(255) ,
    password character varying(255) ,
    unique_number character varying(255)
);

CREATE TABLE IF NOT EXISTS public.customer_order
(
    ordered_date date,
    grand_total bigint,
    id SERIAL PRIMARY KEY,
    order_id bigint,
    hotel_unique_no character varying(255) ,
    order_list jsonb,
    table_no character varying(255) 
);