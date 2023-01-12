-- add lang="en" to <html>

html = HTML.select_one(page, "html")
HTML.set_attribute(html, "lang", "en")
