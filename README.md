# true-self

## Project Structure
- **backend/**: Ktor 3 server, Exposed ORM, analytics API
- **frontend/**: React 18 + Vite + TS, Tailwind, Recharts dashboard
- **helm/**: Kubernetes Helm chart for deployment
- **infra/**: Docker Compose for local dev
- **docs/**: ERD and JSON schema docs

## Development
### Backend
```
cd backend
# requires JDK 17 and Gradle
gradle run
```

### Frontend
```
cd frontend
npm install
npm run dev
```

### Dashboard & Analytics
- Analytics endpoints under `/analytics/*` (e.g., `/analytics/funnel`)
- Frontend uses Recharts for charts.
- Prioritized metric: funnel drop-off rate.

### Docker Compose
```
docker compose -f infra/docker-compose.yml up --build
```

## Story JSON
See [docs/story-schema.json](docs/story-schema.json) for node/edge structure.

## License
Open source components including ONNX models must be used.
