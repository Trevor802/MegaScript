using System;
using System.Collections.Generic;
namespace MegaScrypt {
    public class ScriptFunction : IFunction {
        private string m_name;
        public string Name => m_name;
        private List<string> m_paramNameList;
        public List<string> ParamNameList => m_paramNameList;
        private CalculatorParser.FuncDeclarationContext m_ctx;
        public CalculatorParser.FuncDeclarationContext Context => m_ctx;

        internal delegate object Invocation(ScriptFunction func, List<object> parameters, Stack stack = null);
        private Invocation m_invocation;

        internal ScriptFunction(Processor processor, Invocation invocation, CalculatorParser.FuncDeclarationContext ctx) {
            m_ctx = ctx;
            m_name = FindName(processor);
            m_paramNameList = ctx.varList() is null ? new List<string>() : ctx.varList().Accept(processor) as List<string>;
            m_invocation = invocation;
        }

        private string FindName(Processor processor) {
            var node = m_ctx.Parent;
            while (node != null) {
                var declCtx = node as CalculatorParser.DeclarationContext;
                if (declCtx is null) {
                    node = node.Parent;
                    continue;
                }
                return declCtx.Id().Accept(processor) as string;
            }
            return null;
        }

        object IFunction.Invoke(List<object> parameters, Stack stack) {
            return m_invocation.Invoke(this, parameters, stack);
        }
    }
}
