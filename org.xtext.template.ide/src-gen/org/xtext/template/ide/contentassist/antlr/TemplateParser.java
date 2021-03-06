/*
 * generated by Xtext 2.14.0
 */
package org.xtext.template.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.template.ide.contentassist.antlr.internal.InternalTemplateParser;
import org.xtext.template.services.TemplateGrammarAccess;

public class TemplateParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TemplateGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TemplateGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getArgumentListAccess().getAlternatives(), "rule__ArgumentList__Alternatives");
			builder.put(grammarAccess.getFunctionCallAccess().getAlternatives(), "rule__FunctionCall__Alternatives");
			builder.put(grammarAccess.getGenericAccess().getAlternatives(), "rule__Generic__Alternatives");
			builder.put(grammarAccess.getVarDeclarationAccess().getAlternatives_0(), "rule__VarDeclaration__Alternatives_0");
			builder.put(grammarAccess.getReturnTypeAccess().getAlternatives(), "rule__ReturnType__Alternatives");
			builder.put(grammarAccess.getAccessOperatorAccess().getAlternatives_1(), "rule__AccessOperator__Alternatives_1");
			builder.put(grammarAccess.getFunctionAccess().getAlternatives_5(), "rule__Function__Alternatives_5");
			builder.put(grammarAccess.getStatementAccess().getAlternatives_0(), "rule__Statement__Alternatives_0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
			builder.put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getBooleanAccess().getGroup(), "rule__Boolean__Group__0");
			builder.put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
			builder.put(grammarAccess.getArgumentListAccess().getGroup_3(), "rule__ArgumentList__Group_3__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_1(), "rule__FunctionCall__Group_1__0");
			builder.put(grammarAccess.getGenericAccess().getGroup_0(), "rule__Generic__Group_0__0");
			builder.put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
			builder.put(grammarAccess.getVarAssignAccess().getGroup(), "rule__VarAssign__Group__0");
			builder.put(grammarAccess.getAccessOperatorAccess().getGroup(), "rule__AccessOperator__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
			builder.put(grammarAccess.getTemplateAccess().getElementsAssignment(), "rule__Template__ElementsAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TemplateGrammarAccess grammarAccess;

	@Override
	protected InternalTemplateParser createParser() {
		InternalTemplateParser result = new InternalTemplateParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TemplateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TemplateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
