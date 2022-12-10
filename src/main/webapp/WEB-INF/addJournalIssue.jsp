<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>LIBRARY MANAGEMENT SYSTEM APPLICATION</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <style>
            body {
                background-color: darkgray;
            }
        </style>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light" style="display: block; background-color: #212025;">
            <a style="float: left; width: 26%; padding: 10px; font-size: large; color: aliceblue;"
                href="/librarianHomepage">LIBRARY MANAGEMENT SYSTEM</a>
            <div
                style="float: left; width: 55%; padding: 10px; font-size: large; color: #212025; background-color: #212025;">
                <form action="/search" method="POST"><input type="text" name="searchText" id="searchText"
                        style="display: inline-block; width: 70%;" placeholder="Search Here"><input type="submit"
                        id="submit" style="display: inline-block;">
                </form>
            </div>
            <button
                style="float: right; width: 15%; padding: 10px; font-size: large; color: aliceblue; background-color: #212025;"
                onclick="window.location.href='/'">
                Logout</button>
        </nav>

        <section
            style="display: block; margin: auto; width: 50%; background-color: #212025; color: aliceblue; border-radius: 2%;">
            <form style="display: block; padding: 2%;" action="/addJournalIssue" method="POST">
                <div class="form-group">
                    <label for="journalIssueId">Magazine Issue ID</label>
                    <input type="number" class="form-control" name="journalIssueId" id="journalIssueId" placeholder="1">
                </div>
                <div class="form-group">
                    <label for="title">Title</label>
                    <input type="text" class="form-control" name="title" placeholder="Climate Change">
                </div>
                <div class="form-group">
                    <label for="datePublished">Date Published</label>
                    <input type="date" class="form-control" name="datePublished" placeholder="MM-DD-YYYY">
                </div>
                <div class="form-group">
                    <label for="editorId">Editor IDs</label>
                    <input type="text" class="form-control" name="editorId" placeholder="1,2,3">
                    <small><a href="/addEditor">NEW Editor? ADD HERE</a></small>
                </div>
                <div class="form-group">
                    <label for="contributorId">Contributor IDs</label>
                    <input type="text" class="form-control" name="contributorId" placeholder="1,2,3">
                    <small><a href="/addContributor">NEW Contributor? ADD HERE</a></small>
                </div>
                <div class="form-group">
                    <label for="journalArticleId">Journal Article ID</label>
                    <input type="text" class="form-control" name="journalArticleId" placeholder="1,2,3">
                    <small><a href="/addJournalArticle">NEW ARTICLE ISSUE? ADD HERE</a></small>
                </div>

                <button type="submit" id="submit" class="btn btn-primary">ADD MAGAZINE ISSUE</button>
            </form>
        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>

    </html>