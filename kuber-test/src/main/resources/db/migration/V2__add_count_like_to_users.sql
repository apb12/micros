ALTER TABLE users
    ADD COLUMN IF NOT EXISTS
        like_count BIGINT;