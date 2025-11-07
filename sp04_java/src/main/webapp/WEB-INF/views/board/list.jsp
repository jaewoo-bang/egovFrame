<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/board/list.jsp</title>
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
  rel="stylesheet">
</head>
<body>
<div class="container-lg my-4">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h3 class="m-0">게시글 목록</h3>
    <a href="/board/register" class="btn btn-primary btn-sm">새 글 작성</a>
  </div>

  <table class="table table-hover align-middle">
    <thead class="table-light">
      <tr>
        <th style="width:100px;">번호</th>
        <th style="width:140px;">작성자</th>
        <th>제목</th>
        <th style="width:160px; text-align:center;">댓글</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="board">
      <c:set var="replies" value="${board.reply}" />
      <c:set var="replyCount" value="${empty replies ? 0 : fn:length(replies)}" />

      <!-- 게시글 행 -->
      <tr>
        <td>${board.bno}</td>
        <td>${board.writer}</td>
        <td>
          <a href="/board/update?bno=${board.bno}" class="link-dark text-decoration-none">
            ${board.title}
          </a>
        </td>
        <td class="text-center">
          <button class="btn btn-outline-secondary btn-sm"
                  type="button"
                  data-bs-toggle="collapse"
                  data-bs-target="#reply-${board.bno}"
                  aria-expanded="false"
                  aria-controls="reply-${board.bno}">
            댓글 <span class="badge bg-secondary">${replyCount}</span>
          </button>
        </td>
      </tr>

      <!-- 댓글 영역 행 (colspan으로 전체 폭 사용) -->
      <tr class="border-0">
        <td colspan="4" class="p-0">
          <div id="reply-${board.bno}" class="collapse">
            <div class="p-3 border-top">

              <c:choose>
                <c:when test="${replyCount > 0}">
                  <div class="table-responsive">
                    <table class="table table-sm align-middle mb-0">
                      <thead class="table-light">
                        <tr>
                          <th style="width:110px;">RNO</th>
                          <th style="width:120px;">REPLYER</th>
                          <th>REPLY</th>
                          <th style="width:170px;">REPLYDATE</th>
                          <th style="width:170px;">UPDATEDATE</th>
                          <th style="width:120px;" class="text-center">관리</th>
                        </tr>
                      </thead>
                      <tbody>
                        <c:forEach items="${replies}" var="r">
                          <tr>
                            <td>${r.rno}</td>
                            <td><c:out value="${r.replyer}" /></td>
                            <td><c:out value="${r.reply}" /></td>
                            <td>
                              <c:choose>
                                <c:when test="${not empty r.replydate}">
                                  <fmt:formatDate value="${r.replydate}" pattern="yyyy-MM-dd HH:mm"/>
                                </c:when>
                                <c:otherwise>-</c:otherwise>
                              </c:choose>
                            </td>
                            <td>
                              <c:choose>
                                <c:when test="${not empty r.updatedate}">
                                  <fmt:formatDate value="${r.updatedate}" pattern="yyyy-MM-dd HH:mm"/>
                                </c:when>
                                <c:otherwise>-</c:otherwise>
                              </c:choose>
                            </td>
                            <td class="text-center">
                              <!-- 삭제 -->
                              <form method="post" action="/reply/delete" class="d-inline">
                                <input type="hidden" name="rno" value="${r.rno}">
                                <input type="hidden" name="bno" value="${board.bno}">
                                <button type="submit" class="btn btn-outline-danger btn-sm"
                                        onclick="return confirm('댓글을 삭제할까요?');">
                                  삭제
                                </button>
                              </form>
                              <!-- (선택) 수정 이동 -->
                              <!--
                              <a href="/reply/edit?rno=${r.rno}&bno=${board.bno}" class="btn btn-outline-primary btn-sm">수정</a>
                              -->
                            </td>
                          </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                </c:when>
                <c:otherwise>
                  <div class="text-center text-secondary py-3">댓글이 없습니다.</div>
                </c:otherwise>
              </c:choose>

              <!-- 댓글 입력 폼 (RNO는 PK 자동, REPLYDATE/UPDATEDATE는 DB 기본값 sysdate 사용) -->
              <form class="mt-3" method="post" action="/reply">
                <input type="hidden" name="bno" value="${board.bno}">
                <div class="row g-2">
                  <div class="col-md-2">
                    <input type="text" name="replyer" class="form-control form-control-sm" placeholder="작성자(50자)" maxlength="50" required>
                  </div>
                  <div class="col-md-8">
                    <input type="text" name="reply" class="form-control form-control-sm" placeholder="댓글 내용(최대 1000자)" maxlength="1000" required>
                  </div>
                  <div class="col-md-2 d-grid">
                    <button type="submit" class="btn btn-sm btn-primary">댓글등록</button>
                  </div>
                </div>
              </form>

            </div>
          </div>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
