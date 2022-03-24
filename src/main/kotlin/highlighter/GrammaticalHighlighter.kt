package highlighter

import lexer.HTok
import org.antlr.v4.runtime.tree.ParseTreeListener

interface GrammaticalHighlighter: ParseTreeListener {
    fun getOverrides(): Collection<HTok>
    fun reset()
}
