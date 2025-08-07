# ERD

## Core Tables
- **users**(id, username, email, hashed_password)
- **stories**(id, author_id -> users, title, slug, is_public, approved)
- **nodes**(id, story_id -> stories, content)
- **edges**(id, source_node_id -> nodes, target_node_id -> nodes, label)
- **sessions**(id, user_id -> users, story_id -> stories, started_at, completed_at)
- **choices**(id, session_id -> sessions, node_id -> nodes, edge_id -> edges, emotion)

## Analytics Views
- **funnel_metrics**(story_id, node_id, views, exits, drop_rate)
- **emotion_trends**(story_id, ts, sentiment_score)
