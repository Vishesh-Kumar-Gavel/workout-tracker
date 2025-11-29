CREATE TABLE IF NOT EXISTS public.exercise_description
(
    ed_id serial NOT NULL,
    ed_name character varying(225) COLLATE pg_catalog."default",
    ed_equipment character varying(225) COLLATE pg_catalog."default",
    ed_variation character varying(225) COLLATE pg_catalog."default",
    ed_utility character varying(225) COLLATE pg_catalog."default",
    ed_mechanics character varying(225) COLLATE pg_catalog."default",
    ed_force character varying(20) COLLATE pg_catalog."default",
    ed_preparation character varying(1000) COLLATE pg_catalog."default",
    ed_execution character varying(1000) COLLATE pg_catalog."default",
    ed_target_muscle character varying(1000) COLLATE pg_catalog."default",
    ed_synergist_muscle character varying(1000) COLLATE pg_catalog."default",
    ed_stabilizer_muscle character varying(1000) COLLATE pg_catalog."default",
    ed_antagonist_muscle character varying(1000) COLLATE pg_catalog."default",
    ed_dynamic_stabilizer_muscle character varying(1000) COLLATE pg_catalog."default",
    ed_main_muscle character varying(225) COLLATE pg_catalog."default",
    ed_difficulty integer,
    ed_secondary_muscle character varying(225) COLLATE pg_catalog."default",
    ed_parent_id integer,
    CONSTRAINT exercise_description_pkey PRIMARY KEY (ed_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.exercise_description
    OWNER to vishesh;

COMMENT ON TABLE public.exercise_description
    IS 'contains exercise description';