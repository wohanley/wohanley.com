---
id: document-automation
title: Document Automation in British Columbia
desc: Porting the Document Assembly Line to British Columbia
layout: post.html
urlOverride: /document-automation
crumbs: [['home', '/'], ['trivia', '/trivia/'], ['document automation']]
tags: [law, project]
---

Document Automation in British Columbia
---------------------------------------

I'm starting a project this semester, as a course of directed studies at the University of Victoria Faculty of Law, to automate legal forms in a British Columbian or broader Canadian context. This post will explain the motivation for the project, what I hope to accomplish, and the means by which I'll be moving forward. If there are some legal forms that it would help you to have automated and that you think would be a good fit for the project, please [send me an email](mailto:%6De@woh%61%6E%6Cey.com).

One of the areas I've been trying to explore, in my classes at UVic and my work at [ACE](http://www.uvicace.com), is the intersection of law, technology, and design. Canadian law is fundamentally technologically embodied, even if that technology is as old as writing and paper, and lawyers and law-adjacent workers have a responsibility to consider how well those technologies are serving the public. In the case of legal forms, which generally exist on paper or as flat, static PDFs buried on court websites, it is very often the case that this question has not received enough critical attention and work.

Document automation approaches have had some success in improving the experience of justice system participants dealing with complex legal forms. The basic idea is to separate the gathering of information from its submission. Rather than asking end users to fill out a form that is optimized for intake by courts or other justice system actors, you create a guided interview that gathers information in a way that is easy for the user, then use that information to automatically fill out the necessary forms yourself. Quinten Steenuis describes the resulting product as a ["clinic in a box"](https://medium.com/legal-design-and-innovation/creating-a-clinic-in-a-box-why-i-fell-in-love-with-building-online-legal-apps-8b56a6e0ed1c), providing the example of [MADE](https://gbls.org/MADE), a guided interview that helps Massachusetts tenants respond to eviction cases. Document automation is useful where forms themselves are a significant source of complexity, for example, where there are multiple schedules which may or may not be necessary depending on the circumstances, or where it isn't clear what certain questions are asking about.

There are many different document automation tools deployed in many different contexts. This project will draw mainly from [Docassemble](https://docassemble.org/) and the [Document Assembly Line](https://suffolklitlab.org/doc-assembly-line/) and [MassAccess](https://massaccess.suffolklitlab.org/) projects. Docassemble is an expert system for guided interviews and document assembly, and the Document Assembly Line is a volunteer project using Docassemble to create guided interviews to complete and file court forms in Massachusetts, interviews which are made available to the public through MassAccess. These projects have a few key characteristics that make a spinoff like mine feasible:
<ul>
  <li>Docassemble is free.</li>
  <li>Docassemble is open source, released under the MIT licence. What this means is that I can do whatever I need to with the code that makes up Docassemble and any code I produce based on it. Being without a team of software developers and operators, I would not be in a position to handle the burden of specific usage or deployment procedures required by a proprietary licence, and I need to be able to deploy my work in the way that is most familiar and convenient for me. I also think that open source is an imperative in most parts of the legal technology space, for reasons captured under the umbrella of Laurence Diver's concept of [digisprudence](https://osf.io/preprints/lawarxiv/nechu).</li>
  <li>The Document Assembly Line Project is designed for participation and operates entirely in the open. Every step of their process is publicly visible and therefore easily copied, if necessary. I don't need to worry about getting stuck on something I don't know how to deal with.</li>
</ul>

So, what I am beginning work on is more or less a port of the Document Assembly Line to British Columbia. I will be starting small out of necessity, but with a clear process and accessible tools, even a one-person project can produce some useful automations. If this project sounds like something you'd like to be involved in, even if that involvement is just to point me at some forms you think are good candidates for automation, please [get in touch](mailto:%6De@woh%61%6E%6Cey.com).
