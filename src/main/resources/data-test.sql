-- Insertar en la tabla readers primero
-- Insertar primero un usuario que servirá como referencia
INSERT INTO readers (first_name, last_name, fullname, created_at, update_at, user_id)
VALUES ('Admin', 'User', 'Admin User', '2024-01-01', '2024-01-02', NULL);

-- Luego insertar otros usuarios, usando la referencia a la fila recién insertada
INSERT INTO readers (first_name, last_name, fullname, created_at, update_at, user_id)
VALUES
    ('Test', 'User101 Test', 'Test User', '2024-01-01', '2024-01-02', 1),
    ('Example', 'User102 Example', 'Example User', '2024-01-03', '2024-01-04', 1);

-- Luego, insertar en donations (cuando los registros de readers ya estén presentes)
INSERT INTO donations (id, amount, created_at, user_id)
VALUES
    (3, 100.0, '2024-01-01', 1),
    (4, 50.0, '2024-01-03', 2);

-- Tabla: purchases
INSERT INTO purchases (id, total, created_at, updated_at, user_id, donation_id)
VALUES
    (1, 50.0, '2024-01-05', '2024-01-06', 1, 1),
    (2, 30.5, '2024-01-07', '2024-01-08', 2, 2)
    ON CONFLICT (id) DO NOTHING;

-- Tabla: favorites
-- Insertar registros en la tabla 'favorites'
INSERT INTO favorites (id, name, reader_id)
VALUES
    (1, 'My Favorite Articles', 1), -- 'reader_id' hace referencia a 'reader' (1)
    (2, 'Interesting Reads', 2); -- 'reader_id' hace referencia a 'reader' (2)

-- Tabla: categories
-- Insertar registros en la tabla 'categories'
INSERT INTO categories (id, name, description, created_at, updated_at)
VALUES
    (1, 'Technology', 'All about technology', '2024-01-01', '2024-01-02'), -- Categoría de tecnología
    (2, 'Science', 'Scientific discoveries', '2024-01-03', '2024-01-04'); -- Categoría de ciencia

-- Tabla: creators
-- Insertar registros en la tabla 'creators'
INSERT INTO creators (id, first_name, last_name, biography, created_at, updated_at, user_id)
VALUES
    (1, 'Alice', 'Johnson', 'Author and journalist', '2024-01-01', '2024-01-02', 201), -- 'user_id' hace referencia a un usuario (201)
    (2, 'Bob', 'Brown', 'Content creator', '2024-01-03', '2024-01-04', 202); -- 'user_id' hace referencia a un usuario (202)

-- Tabla: articles
-- Insertar tres artículos en la tabla 'articles'
INSERT INTO articles (id, title, slug, content, file_path, creator_id, category_id, created_at, updated_at)
VALUES
    (1, 'Understanding AI', 'understanding-ai', 'Content about AI', '/files/ai.pdf', 1, 1, '2024-01-01', '2024-01-02'),
    (2, 'Future of Tech', 'future-tech', 'Tech trends in 2024', '/files/tech.pdf', 2, 2, '2024-01-03', '2024-01-04'),
    (3, 'Innovation in Science', 'innovation-science', 'The role of innovation in science', '/files/science.pdf', 1, 1, '2024-01-05', '2024-01-06');

-- Tabla: collection_articles
-- Insertar registros en la tabla 'collection_articles'
INSERT INTO collection_articles (favorite_id, article_id, added_date)
VALUES
    (1, 1, '2024-01-09'), -- 'favorite_id' hace referencia a 'favorites' (1), 'article_id' hace referencia a 'articles' (1)
    (1, 2, '2024-01-10'), -- 'favorite_id' hace referencia a 'favorites' (1), 'article_id' hace referencia a 'articles' (2)
    (2, 3, '2024-01-11'); -- 'favorite_id' hace referencia a 'favorites' (2), 'article_id' hace referencia a 'articles' (3)

-- Tabla: plans
-- Insertar registros en la tabla 'plans'
INSERT INTO plans (id, type, price)
VALUES
    (1, 'Basic', 10.99), -- Plan básico
    (2, 'Premium', 20.99); -- Plan premium

-- Tabla: subscriptions
-- Insertar registros en la tabla 'subscriptions'
INSERT INTO subscriptions (id, price, duration, status, subscription_date, end_date, plan_id, reader_id)
VALUES
    (1, '10.99', '1 month', true, '2024-01-01', '2024-01-31', 1, 1), -- 'plan_id' hace referencia a 'plans' (1), 'reader_id' hace referencia a 'readers' (1)
    (2, '20.99', '3 months', true, '2024-02-01', '2024-04-30', 2, 2); -- 'plan_id' hace referencia a 'plans' (2), 'reader_id' h
