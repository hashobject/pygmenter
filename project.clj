(defproject pygmenter "0.1.1"
  :description "A Clojure wrapper for Pygments (syntax highlighter)."
  :signing {:gpg-key "HashObject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/pygmenter"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.python/jython-standalone "2.5.3"]
                 [org.pygments/pygments "1.6"]])
