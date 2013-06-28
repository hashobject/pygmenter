(ns pygmenter.core-test
  (:use clojure.test
        pygmenter.core))

(def clojure-code "(defn [] (println 'Hello world!'))")

(deftest pygmentize-test
  (testing "pygmetize method that should return html"
    (is (= "<div class=\"highlight\"><pre><span class=\"p\">(</span><span class=\"n\">defn</span> <span class=\"p\">[]</span> <span class=\"p\">(</span><span class=\"n\">println</span> <span class=\"s\">&#39;Hello world!&#39;</span><span class=\"p\">))</span>\n</pre></div>\n"
           (pygmentize clojure-code)))))
