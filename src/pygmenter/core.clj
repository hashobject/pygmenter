(ns pygmenter.core
  "Library for wrapping Pygments.")

(def command
  (str "from pygments import highlight\n"
    "from pygments.lexers import PythonLexer\n"
    "from pygments.formatters import HtmlFormatter\n"
    "\nresult = highlight(code, PythonLexer(), HtmlFormatter())"))

(defn pygmentize
  "Pygmentize 'code' object. HTML will be generated."
  [code]
  (let [python (org.python.util.PythonInterpreter.)]
    (.set python "code" code)
    (.exec python command)
    (.get python "result" String)))
