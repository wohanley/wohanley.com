---
title: Scraping a map together
tags: [software]
---

I really like the Berlin Wall. I’m not sure what it is about it, but the idea of a wall separating an entire city like that really strikes me.

When the wall came down, the German government naturally had to figure out what to do with all that concrete. Ordinarily it would have gone to the dump or something, I suppose, but this was concrete with sentimental value. People all over the world wanted pieces of it, so the Germans sent them pieces, and the wall ended up scattered to the winds (mostly westward). Here are all the ones that Wikipedia knows about:

<iframe width="425" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps/ms?msa=0&amp;msid=204753333440211135704.0004cf97aec18db0316c3&amp;ie=UTF8&amp;t=m&amp;source=embed&amp;ll=14.944785,12.65625&amp;spn=92.254439,271.456295&amp;output=embed"></iframe><br /><small>View <a href="https://maps.google.com/maps/ms?msa=0&amp;msid=204753333440211135704.0004cf97aec18db0316c3&amp;ie=UTF8&amp;t=m&amp;source=embed&amp;ll=14.944785,12.65625&amp;spn=92.254439,271.456295" style="color:#0000FF;text-align:left">Berlin Wall Segments</a> in a larger map</small>

So now I can go and see them! This was a neat little afternoon's project involving the BeautifulSoup module for Python and some KML manipulation. You can see the [source](https://github.com/wohanley/wiki-mapper "wiki-mapper") on Github, and use it yourself to make your own maps, because Wikipedia uses a pretty standard list format. Have fun!
