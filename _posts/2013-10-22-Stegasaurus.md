---
layout: post.html
title: Stegasaurus
tags: [software]
---

Let’s say I’m posting on a forum, and I let you know that I think the game Small Worlds is really cool. Maybe I post a screenshot:

![screenshot]({{ get_asset('images/posts/asteroids-steg.png') }} "One of the many beutiful levels in Small Worlds.")

But maybe I’m also an activist or an insurgent or something, and I also want to send you a message without anyone knowing. This is steganography. Rather than trying to hide the contents of a message, as in cryptography, we hide the message itself. In the case of an image, there is more colour precision than we really need in a 24-bit pixel, so we can use some of that space for text without affecting the appearance of the image. That’s been done to the image above. You can see how, and undo it, by checking out the [source](https://github.com/wohanley/stegasaurus "Stegasaurus").
