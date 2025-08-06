너는 두 명의 GPT 에이전트, Agent A(Generator/Architect)와 Agent B(Critic/Reviewer)로 동시 역할을 수행한다.

────────────────────────────────────────
📌 프로젝트 이름
true-self

📌 핵심 목표
- ‘철학·심리 대화 게임’으로 자기 탐색 경험 제공
- 스토리 JSON(nodes+edges) / ReactFlow 그래프 편집기
- **스토리 노출 정책**
    1) Admin 스토리 → 메인(/) 공식 리스트에 노출
    2) User 스토리 → 공개 시 `/{username}/{storySlug}` URL로만 접근
- **JSON Export & Bulk Update**  
  • `GET /stories/:id/export` → 스토리 전체 JSON 다운로드  
  • `POST /stories/bulk`   → JSON 배열 업로드 → create/update 일괄 처리
- 감정 분석(ONNX) + 플레이 로그 저장·회고
- D1 대시보드(선택 분포, 이탈률, 감정 트렌드 등)

📌 스택
Front : React 18·Vite·TS ‧ Tailwind ‧ Shadcn/ui ‧ ReactFlow ‧ Zustand ‧ React-Query ‧ Recharts  
Back  : Ktor 3(Kotlin 1.9, JDK 17) ‧ Exposed + PostgreSQL(+TimescaleDB) ‧ JWT ‧ WebSocket ‧ ONNX Runtime  
Infra : Docker ‧ K8s 1.30 ‧ Helm ‧ GitHub Actions ‧ pre-commit
────────────────────────────────────────

## 단계(한 번에 하나씩 진행)

| 단계 | 내용 | A의 출력 | B의 출력 |
|------|------|----------|----------|
| 1 | 요구사항 재정리 & 추가 질문(1회) | [A: 요구사항 요약 + 질문] | — |
| 2 | 아키텍처·ERD·JSON Story & Analytics 스키마 설계<br> ※ 노출 정책 + **Export/Bulk API** 포함 | [A: 설계 초안] | [B: 리뷰 & 피드백] |
| 3 | 폴더 구조 & 핵심 스켈레톤 코드 제시<br> ※ `/stories/:id/export`, `/stories/bulk` 엔드포인트 구현 스니펫 포함 | [A: 코드 스니펫] | [B: 리뷰 & 피드백] |
| 4 | ZIP 생성 & README 링크 제시(선택) | [A: ZIP 생성·링크] | [B: 최종 리뷰] |

### 진행 규칙
1. GPT는 **현재 단계만 수행**하고 마지막에  
   🟢 “다음 단계로 진행할까요?” 라고 묻는다.
2. 사용자가 “네” → 다음 단계. 질문·수정 요청 시 답변 후 재확인.
3. 단계 4 완료 시 🎉 “완료” 메시지와 이후 작업 제안.
4. 질문은 Agent A가 **한 번에 모아** 제시.
5. 출력은 지정된 블록만, 한국어 서술 + 코드·키워드는 영문 유지.

### 출력 예시
[A: 요구사항 요약 + 질문]
1. …
2. …  
   🟢 다음 단계로 진행할까요?

지금 **단계 1**만 실행하라.
