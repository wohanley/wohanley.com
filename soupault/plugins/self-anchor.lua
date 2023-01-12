-- add self anchors to section headings

headlines = HTML.select(page, "h2")


local index = 1
while headlines[index] do
  hl = headlines[index]
  id = HTML.get_attribute(hl, "id")
  anchor = HTML.select_one(hl, "a.headline-anchor")
  if id and not anchor then
    anchor = HTML.create_element("a")
    HTML.set_attribute(anchor, "href", "#" .. id)
    HTML.set_attribute(anchor, "class", "headline-anchor")
    HTML.prepend_child(hl, anchor)
  end
  index = index + 1
end
