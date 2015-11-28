# pygmenter

A Clojure wrapper for [Pygments](http://pygments.org/) (syntax highlighter).

Implemented using following [documentation and code sample](http://pygments.org/docs/java/).

[![Build Status](https://travis-ci.org/hashobject/sitemap.svg)](https://travis-ci.org/hashobject/pygmenter)
[![Dependencies Status](https://jarkeeper.com/hashobject/pygmenter/status.svg)](https://jarkeeper.com/hashobject/pygmenter)
[![Downloads](https://jarkeeper.com/hashobject/pygmenter/downloads.svg)](https://jarkeeper.com/hashobject/pygmenter)

## Install

```
[pygmenter "0.1.1"]
```

## Usage

```
user=> (use 'pygmenter.core)
nil
user=> (pygmentize "(defn [] (println 'Hello world!'))")
<div class=\"highlight\"><pre><span class=\"p\">(</span><span class=\"n\">defn</span> <span class=\"p\">[]</span> <span class=\"p\">(</span><span class=\"n\">println</span> <span class=\"s\">&#39;Hello world!&#39;</span><span class=\"p\">))</span>\n</pre></div>
```

## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013-2015 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
