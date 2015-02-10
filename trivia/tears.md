---
title: Tears
tags: ["art?"]
scripts: ['js/tears/tears.js',
    'js/tears/Cell.js',
    'js/tears/CanvasCell.js',
    'js/tears/ColourBuffer.js',
    'js/tears/CellActionTrace.js',
    'js/tears/start.js']
---

<div id="draw" style="position: relative;">
    <canvas id="background" style="position: absolute; left: 0; top: 0; z-index: 0;"></canvas>
    <canvas id="foreground" style="position: absolute; left: 0; top: 0; z-index: 1;"></canvas>
</div>

This is something I made after a few experiments with Processing. The top layer is a cellular automaton and the bottom reflects calls to the cells' live and die methods. I know everyone always tells you to check out the [source](https://github.com/wohanley/tears "Tears"), but this time I really mean it. It's very easy to tweak some of the constants in the code and get new patterns out of the automaton, so give it a try!