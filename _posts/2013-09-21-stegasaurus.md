---
id: stegasaurus
title: stegasaurus
desc: simple steganography
layout: post.html
crumbs: [['home', '/'], ['trivia', '/trivia/'], ['stegasaurus', '/trivia/stegasaurus.html']]
tags: [project]
---


<p class="section">Let's say I'm posting on a forum, and I let you know that I think the game <a href="http://www.rathergood.com/content/small_worlds/small_worlds.swf">Small Worlds</a> is really cool. Maybe I post a screenshot:</p>
<img class="section" id="small-worlds-screenshot" src="{{ get_asset('images/posts/asteroids-steg.png') }}" alt="One of the many beautiful levels in Small Worlds." title="Small Worlds" />
<p class="section">But maybe I'm also an activist or an insurgent or something, and I also want to send you a message without anyone knowing. This is steganography. Rather than trying to hide the contents of a message, as in cryptography, we hide the message itself. In the case of an image, there is more colour precision than we really need in a 24-bit pixel, so we can use some of that space for text without affecting the appearance of the image. That's been done to the image above. You can see how, and undo it, by checking out the <a href="https://github.com/wohanley/stegasaurus">source</a>.</p>
