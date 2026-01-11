ALTER TABLE "photos"
    ALTER COLUMN content DROP NOT NULL;

ALTER TABLE "photos"
ALTER COLUMN content TYPE bytea
      USING content::bytea;