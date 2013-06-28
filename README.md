# pygmenter

A Clojure wrapper for [Pygments](http://pygments.org/) (syntax highlighter).

Implemented using following [documentation and code sample](http://pygments.org/docs/java/).

[![Build Status](https://travis-ci.org/hashobject/sitemap.png)](https://travis-ci.org/hashobject/pygmenter)

## Install

```shell
[pygmenter "0.1.1"]
```

## Usage

```shell
user=> (use 'pygmenter.core)
nil
user=> (pygmentize "(defn [] (println 'Hello world!'))")
"<div class=\"highlight\"><pre><span class=\"p\">(</span><span class=\"n\">defn</span> <span class=\"p\">[]</span> <span class=\"p\">(</span><span class=\"n\">println</span> <span class=\"s\">&#39;Hello world!&#39;</span><span class=\"p\">))</span>\n</pre></div>\n"
```

## Tips

## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013 HashObject Ltd (team@hashobject.com).

The use and distribution terms for this software are covered by the [Eclipse Public License 1.0](http://opensource.org/licenses/eclipse-1.0)
which can be found in the file epl-v10.html at the root of this distribution.

By using this software in any fashion, you are agreeing to be bound by the terms of this license.

You must not remove this notice, or any other, from this software.
