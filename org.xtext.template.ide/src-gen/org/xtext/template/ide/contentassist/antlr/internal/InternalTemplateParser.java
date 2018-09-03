package org.xtext.template.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.template.services.TemplateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemplateParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'auto'", "'void'", "'.'", "'->'", "'#include'", "'<'", "'>'", "'using'", "'namespace'", "'while'", "'('", "')'", "'{'", "'}'", "'!'", "'return'", "','", "'='"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTemplateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTemplateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTemplateParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTemplate.g"; }


    	private TemplateGrammarAccess grammarAccess;

    	public void setGrammarAccess(TemplateGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTemplate"
    // InternalTemplate.g:53:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalTemplate.g:54:1: ( ruleTemplate EOF )
            // InternalTemplate.g:55:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalTemplate.g:62:1: ruleTemplate : ( ( rule__Template__ElementsAssignment )* ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:66:2: ( ( ( rule__Template__ElementsAssignment )* ) )
            // InternalTemplate.g:67:2: ( ( rule__Template__ElementsAssignment )* )
            {
            // InternalTemplate.g:67:2: ( ( rule__Template__ElementsAssignment )* )
            // InternalTemplate.g:68:3: ( rule__Template__ElementsAssignment )*
            {
             before(grammarAccess.getTemplateAccess().getElementsAssignment()); 
            // InternalTemplate.g:69:3: ( rule__Template__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=12 && LA1_0<=13)||LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTemplate.g:69:4: rule__Template__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Template__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleType"
    // InternalTemplate.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalTemplate.g:79:1: ( ruleType EOF )
            // InternalTemplate.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTemplate.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTemplate.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTemplate.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalTemplate.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTemplate.g:94:3: ( rule__Type__Alternatives )
            // InternalTemplate.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInclude"
    // InternalTemplate.g:103:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalTemplate.g:104:1: ( ruleInclude EOF )
            // InternalTemplate.g:105:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalTemplate.g:112:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:116:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalTemplate.g:117:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalTemplate.g:117:2: ( ( rule__Include__Group__0 ) )
            // InternalTemplate.g:118:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalTemplate.g:119:3: ( rule__Include__Group__0 )
            // InternalTemplate.g:119:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleFile"
    // InternalTemplate.g:128:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalTemplate.g:129:1: ( ruleFile EOF )
            // InternalTemplate.g:130:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalTemplate.g:137:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:141:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalTemplate.g:142:2: ( ( rule__File__Group__0 ) )
            {
            // InternalTemplate.g:142:2: ( ( rule__File__Group__0 ) )
            // InternalTemplate.g:143:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalTemplate.g:144:3: ( rule__File__Group__0 )
            // InternalTemplate.g:144:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleNamespace"
    // InternalTemplate.g:153:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalTemplate.g:154:1: ( ruleNamespace EOF )
            // InternalTemplate.g:155:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalTemplate.g:162:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:166:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalTemplate.g:167:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalTemplate.g:167:2: ( ( rule__Namespace__Group__0 ) )
            // InternalTemplate.g:168:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalTemplate.g:169:3: ( rule__Namespace__Group__0 )
            // InternalTemplate.g:169:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDataType"
    // InternalTemplate.g:178:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalTemplate.g:179:1: ( ruleDataType EOF )
            // InternalTemplate.g:180:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalTemplate.g:187:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:191:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalTemplate.g:192:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalTemplate.g:192:2: ( ( rule__DataType__Alternatives ) )
            // InternalTemplate.g:193:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalTemplate.g:194:3: ( rule__DataType__Alternatives )
            // InternalTemplate.g:194:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleLoop"
    // InternalTemplate.g:203:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalTemplate.g:204:1: ( ruleLoop EOF )
            // InternalTemplate.g:205:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalTemplate.g:212:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:216:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalTemplate.g:217:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalTemplate.g:217:2: ( ( rule__Loop__Group__0 ) )
            // InternalTemplate.g:218:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalTemplate.g:219:3: ( rule__Loop__Group__0 )
            // InternalTemplate.g:219:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBoolean"
    // InternalTemplate.g:228:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalTemplate.g:229:1: ( ruleBoolean EOF )
            // InternalTemplate.g:230:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalTemplate.g:237:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:241:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalTemplate.g:242:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalTemplate.g:242:2: ( ( rule__Boolean__Group__0 ) )
            // InternalTemplate.g:243:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalTemplate.g:244:3: ( rule__Boolean__Group__0 )
            // InternalTemplate.g:244:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleReturn"
    // InternalTemplate.g:253:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // InternalTemplate.g:254:1: ( ruleReturn EOF )
            // InternalTemplate.g:255:1: ruleReturn EOF
            {
             before(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleReturn();

            state._fsp--;

             after(grammarAccess.getReturnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalTemplate.g:262:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:266:2: ( ( ( rule__Return__Group__0 ) ) )
            // InternalTemplate.g:267:2: ( ( rule__Return__Group__0 ) )
            {
            // InternalTemplate.g:267:2: ( ( rule__Return__Group__0 ) )
            // InternalTemplate.g:268:3: ( rule__Return__Group__0 )
            {
             before(grammarAccess.getReturnAccess().getGroup()); 
            // InternalTemplate.g:269:3: ( rule__Return__Group__0 )
            // InternalTemplate.g:269:4: rule__Return__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleArgumentList"
    // InternalTemplate.g:278:1: entryRuleArgumentList : ruleArgumentList EOF ;
    public final void entryRuleArgumentList() throws RecognitionException {
        try {
            // InternalTemplate.g:279:1: ( ruleArgumentList EOF )
            // InternalTemplate.g:280:1: ruleArgumentList EOF
            {
             before(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_1);
            ruleArgumentList();

            state._fsp--;

             after(grammarAccess.getArgumentListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // InternalTemplate.g:287:1: ruleArgumentList : ( ( rule__ArgumentList__Alternatives ) ) ;
    public final void ruleArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:291:2: ( ( ( rule__ArgumentList__Alternatives ) ) )
            // InternalTemplate.g:292:2: ( ( rule__ArgumentList__Alternatives ) )
            {
            // InternalTemplate.g:292:2: ( ( rule__ArgumentList__Alternatives ) )
            // InternalTemplate.g:293:3: ( rule__ArgumentList__Alternatives )
            {
             before(grammarAccess.getArgumentListAccess().getAlternatives()); 
            // InternalTemplate.g:294:3: ( rule__ArgumentList__Alternatives )
            // InternalTemplate.g:294:4: rule__ArgumentList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgumentListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalTemplate.g:303:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalTemplate.g:304:1: ( ruleFunctionCall EOF )
            // InternalTemplate.g:305:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalTemplate.g:312:1: ruleFunctionCall : ( ( rule__FunctionCall__Alternatives ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:316:2: ( ( ( rule__FunctionCall__Alternatives ) ) )
            // InternalTemplate.g:317:2: ( ( rule__FunctionCall__Alternatives ) )
            {
            // InternalTemplate.g:317:2: ( ( rule__FunctionCall__Alternatives ) )
            // InternalTemplate.g:318:3: ( rule__FunctionCall__Alternatives )
            {
             before(grammarAccess.getFunctionCallAccess().getAlternatives()); 
            // InternalTemplate.g:319:3: ( rule__FunctionCall__Alternatives )
            // InternalTemplate.g:319:4: rule__FunctionCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleGeneric"
    // InternalTemplate.g:328:1: entryRuleGeneric : ruleGeneric EOF ;
    public final void entryRuleGeneric() throws RecognitionException {
        try {
            // InternalTemplate.g:329:1: ( ruleGeneric EOF )
            // InternalTemplate.g:330:1: ruleGeneric EOF
            {
             before(grammarAccess.getGenericRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneric();

            state._fsp--;

             after(grammarAccess.getGenericRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneric"


    // $ANTLR start "ruleGeneric"
    // InternalTemplate.g:337:1: ruleGeneric : ( ( rule__Generic__Alternatives ) ) ;
    public final void ruleGeneric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:341:2: ( ( ( rule__Generic__Alternatives ) ) )
            // InternalTemplate.g:342:2: ( ( rule__Generic__Alternatives ) )
            {
            // InternalTemplate.g:342:2: ( ( rule__Generic__Alternatives ) )
            // InternalTemplate.g:343:3: ( rule__Generic__Alternatives )
            {
             before(grammarAccess.getGenericAccess().getAlternatives()); 
            // InternalTemplate.g:344:3: ( rule__Generic__Alternatives )
            // InternalTemplate.g:344:4: rule__Generic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Generic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneric"


    // $ANTLR start "entryRuleObjectType"
    // InternalTemplate.g:353:1: entryRuleObjectType : ruleObjectType EOF ;
    public final void entryRuleObjectType() throws RecognitionException {
        try {
            // InternalTemplate.g:354:1: ( ruleObjectType EOF )
            // InternalTemplate.g:355:1: ruleObjectType EOF
            {
             before(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getObjectTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalTemplate.g:362:1: ruleObjectType : ( RULE_ID ) ;
    public final void ruleObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:366:2: ( ( RULE_ID ) )
            // InternalTemplate.g:367:2: ( RULE_ID )
            {
            // InternalTemplate.g:367:2: ( RULE_ID )
            // InternalTemplate.g:368:3: RULE_ID
            {
             before(grammarAccess.getObjectTypeAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectTypeAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleVarName"
    // InternalTemplate.g:378:1: entryRuleVarName : ruleVarName EOF ;
    public final void entryRuleVarName() throws RecognitionException {
        try {
            // InternalTemplate.g:379:1: ( ruleVarName EOF )
            // InternalTemplate.g:380:1: ruleVarName EOF
            {
             before(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_1);
            ruleVarName();

            state._fsp--;

             after(grammarAccess.getVarNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalTemplate.g:387:1: ruleVarName : ( RULE_ID ) ;
    public final void ruleVarName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:391:2: ( ( RULE_ID ) )
            // InternalTemplate.g:392:2: ( RULE_ID )
            {
            // InternalTemplate.g:392:2: ( RULE_ID )
            // InternalTemplate.g:393:3: RULE_ID
            {
             before(grammarAccess.getVarNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalTemplate.g:403:1: entryRuleVarDeclaration : ruleVarDeclaration EOF ;
    public final void entryRuleVarDeclaration() throws RecognitionException {
        try {
            // InternalTemplate.g:404:1: ( ruleVarDeclaration EOF )
            // InternalTemplate.g:405:1: ruleVarDeclaration EOF
            {
             before(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalTemplate.g:412:1: ruleVarDeclaration : ( ( rule__VarDeclaration__Group__0 ) ) ;
    public final void ruleVarDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:416:2: ( ( ( rule__VarDeclaration__Group__0 ) ) )
            // InternalTemplate.g:417:2: ( ( rule__VarDeclaration__Group__0 ) )
            {
            // InternalTemplate.g:417:2: ( ( rule__VarDeclaration__Group__0 ) )
            // InternalTemplate.g:418:3: ( rule__VarDeclaration__Group__0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getGroup()); 
            // InternalTemplate.g:419:3: ( rule__VarDeclaration__Group__0 )
            // InternalTemplate.g:419:4: rule__VarDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVarAssign"
    // InternalTemplate.g:428:1: entryRuleVarAssign : ruleVarAssign EOF ;
    public final void entryRuleVarAssign() throws RecognitionException {
        try {
            // InternalTemplate.g:429:1: ( ruleVarAssign EOF )
            // InternalTemplate.g:430:1: ruleVarAssign EOF
            {
             before(grammarAccess.getVarAssignRule()); 
            pushFollow(FOLLOW_1);
            ruleVarAssign();

            state._fsp--;

             after(grammarAccess.getVarAssignRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalTemplate.g:437:1: ruleVarAssign : ( ( rule__VarAssign__Group__0 ) ) ;
    public final void ruleVarAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:441:2: ( ( ( rule__VarAssign__Group__0 ) ) )
            // InternalTemplate.g:442:2: ( ( rule__VarAssign__Group__0 ) )
            {
            // InternalTemplate.g:442:2: ( ( rule__VarAssign__Group__0 ) )
            // InternalTemplate.g:443:3: ( rule__VarAssign__Group__0 )
            {
             before(grammarAccess.getVarAssignAccess().getGroup()); 
            // InternalTemplate.g:444:3: ( rule__VarAssign__Group__0 )
            // InternalTemplate.g:444:4: rule__VarAssign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAssignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleReturnType"
    // InternalTemplate.g:453:1: entryRuleReturnType : ruleReturnType EOF ;
    public final void entryRuleReturnType() throws RecognitionException {
        try {
            // InternalTemplate.g:454:1: ( ruleReturnType EOF )
            // InternalTemplate.g:455:1: ruleReturnType EOF
            {
             before(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getReturnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalTemplate.g:462:1: ruleReturnType : ( ( rule__ReturnType__Alternatives ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:466:2: ( ( ( rule__ReturnType__Alternatives ) ) )
            // InternalTemplate.g:467:2: ( ( rule__ReturnType__Alternatives ) )
            {
            // InternalTemplate.g:467:2: ( ( rule__ReturnType__Alternatives ) )
            // InternalTemplate.g:468:3: ( rule__ReturnType__Alternatives )
            {
             before(grammarAccess.getReturnTypeAccess().getAlternatives()); 
            // InternalTemplate.g:469:3: ( rule__ReturnType__Alternatives )
            // InternalTemplate.g:469:4: rule__ReturnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleAccessOperator"
    // InternalTemplate.g:478:1: entryRuleAccessOperator : ruleAccessOperator EOF ;
    public final void entryRuleAccessOperator() throws RecognitionException {
        try {
            // InternalTemplate.g:479:1: ( ruleAccessOperator EOF )
            // InternalTemplate.g:480:1: ruleAccessOperator EOF
            {
             before(grammarAccess.getAccessOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAccessOperator();

            state._fsp--;

             after(grammarAccess.getAccessOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccessOperator"


    // $ANTLR start "ruleAccessOperator"
    // InternalTemplate.g:487:1: ruleAccessOperator : ( ( rule__AccessOperator__Group__0 ) ) ;
    public final void ruleAccessOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:491:2: ( ( ( rule__AccessOperator__Group__0 ) ) )
            // InternalTemplate.g:492:2: ( ( rule__AccessOperator__Group__0 ) )
            {
            // InternalTemplate.g:492:2: ( ( rule__AccessOperator__Group__0 ) )
            // InternalTemplate.g:493:3: ( rule__AccessOperator__Group__0 )
            {
             before(grammarAccess.getAccessOperatorAccess().getGroup()); 
            // InternalTemplate.g:494:3: ( rule__AccessOperator__Group__0 )
            // InternalTemplate.g:494:4: rule__AccessOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AccessOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessOperatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccessOperator"


    // $ANTLR start "entryRuleFunction"
    // InternalTemplate.g:503:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalTemplate.g:504:1: ( ruleFunction EOF )
            // InternalTemplate.g:505:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalTemplate.g:512:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:516:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalTemplate.g:517:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalTemplate.g:517:2: ( ( rule__Function__Group__0 ) )
            // InternalTemplate.g:518:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalTemplate.g:519:3: ( rule__Function__Group__0 )
            // InternalTemplate.g:519:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleStatement"
    // InternalTemplate.g:528:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTemplate.g:529:1: ( ruleStatement EOF )
            // InternalTemplate.g:530:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTemplate.g:537:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:541:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalTemplate.g:542:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalTemplate.g:542:2: ( ( rule__Statement__Group__0 ) )
            // InternalTemplate.g:543:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalTemplate.g:544:3: ( rule__Statement__Group__0 )
            // InternalTemplate.g:544:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEnd"
    // InternalTemplate.g:553:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalTemplate.g:554:1: ( ruleEnd EOF )
            // InternalTemplate.g:555:1: ruleEnd EOF
            {
             before(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalTemplate.g:562:1: ruleEnd : ( ';' ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:566:2: ( ( ';' ) )
            // InternalTemplate.g:567:2: ( ';' )
            {
            // InternalTemplate.g:567:2: ( ';' )
            // InternalTemplate.g:568:3: ';'
            {
             before(grammarAccess.getEndAccess().getSemicolonKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getSemicolonKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalTemplate.g:577:1: rule__Type__Alternatives : ( ( ruleInclude ) | ( ruleNamespace ) | ( ruleFunction ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:581:1: ( ( ruleInclude ) | ( ruleNamespace ) | ( ruleFunction ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 12:
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTemplate.g:582:2: ( ruleInclude )
                    {
                    // InternalTemplate.g:582:2: ( ruleInclude )
                    // InternalTemplate.g:583:3: ruleInclude
                    {
                     before(grammarAccess.getTypeAccess().getIncludeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInclude();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIncludeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:588:2: ( ruleNamespace )
                    {
                    // InternalTemplate.g:588:2: ( ruleNamespace )
                    // InternalTemplate.g:589:3: ruleNamespace
                    {
                     before(grammarAccess.getTypeAccess().getNamespaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNamespace();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getNamespaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTemplate.g:594:2: ( ruleFunction )
                    {
                    // InternalTemplate.g:594:2: ( ruleFunction )
                    // InternalTemplate.g:595:3: ruleFunction
                    {
                     before(grammarAccess.getTypeAccess().getFunctionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFunctionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalTemplate.g:604:1: rule__DataType__Alternatives : ( ( 'auto' ) | ( 'void' ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:608:1: ( ( 'auto' ) | ( 'void' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTemplate.g:609:2: ( 'auto' )
                    {
                    // InternalTemplate.g:609:2: ( 'auto' )
                    // InternalTemplate.g:610:3: 'auto'
                    {
                     before(grammarAccess.getDataTypeAccess().getAutoKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getAutoKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:615:2: ( 'void' )
                    {
                    // InternalTemplate.g:615:2: ( 'void' )
                    // InternalTemplate.g:616:3: 'void'
                    {
                     before(grammarAccess.getDataTypeAccess().getVoidKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getVoidKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ArgumentList__Alternatives"
    // InternalTemplate.g:625:1: rule__ArgumentList__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__ArgumentList__Group_3__0 ) ) );
    public final void rule__ArgumentList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:629:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__ArgumentList__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTemplate.g:630:2: ( RULE_ID )
                    {
                    // InternalTemplate.g:630:2: ( RULE_ID )
                    // InternalTemplate.g:631:3: RULE_ID
                    {
                     before(grammarAccess.getArgumentListAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getArgumentListAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:636:2: ( RULE_STRING )
                    {
                    // InternalTemplate.g:636:2: ( RULE_STRING )
                    // InternalTemplate.g:637:3: RULE_STRING
                    {
                     before(grammarAccess.getArgumentListAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getArgumentListAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTemplate.g:642:2: ( RULE_INT )
                    {
                    // InternalTemplate.g:642:2: ( RULE_INT )
                    // InternalTemplate.g:643:3: RULE_INT
                    {
                     before(grammarAccess.getArgumentListAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getArgumentListAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTemplate.g:648:2: ( ( rule__ArgumentList__Group_3__0 ) )
                    {
                    // InternalTemplate.g:648:2: ( ( rule__ArgumentList__Group_3__0 ) )
                    // InternalTemplate.g:649:3: ( rule__ArgumentList__Group_3__0 )
                    {
                     before(grammarAccess.getArgumentListAccess().getGroup_3()); 
                    // InternalTemplate.g:650:3: ( rule__ArgumentList__Group_3__0 )
                    // InternalTemplate.g:650:4: rule__ArgumentList__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArgumentList__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentListAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Alternatives"


    // $ANTLR start "rule__FunctionCall__Alternatives"
    // InternalTemplate.g:658:1: rule__FunctionCall__Alternatives : ( ( ruleObjectType ) | ( ( rule__FunctionCall__Group_1__0 ) ) );
    public final void rule__FunctionCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:662:1: ( ( ruleObjectType ) | ( ( rule__FunctionCall__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17||LA5_1==22) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==11||LA5_1==23) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTemplate.g:663:2: ( ruleObjectType )
                    {
                    // InternalTemplate.g:663:2: ( ruleObjectType )
                    // InternalTemplate.g:664:3: ruleObjectType
                    {
                     before(grammarAccess.getFunctionCallAccess().getObjectTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectType();

                    state._fsp--;

                     after(grammarAccess.getFunctionCallAccess().getObjectTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:669:2: ( ( rule__FunctionCall__Group_1__0 ) )
                    {
                    // InternalTemplate.g:669:2: ( ( rule__FunctionCall__Group_1__0 ) )
                    // InternalTemplate.g:670:3: ( rule__FunctionCall__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionCallAccess().getGroup_1()); 
                    // InternalTemplate.g:671:3: ( rule__FunctionCall__Group_1__0 )
                    // InternalTemplate.g:671:4: rule__FunctionCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionCallAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Alternatives"


    // $ANTLR start "rule__Generic__Alternatives"
    // InternalTemplate.g:679:1: rule__Generic__Alternatives : ( ( ( rule__Generic__Group_0__0 ) ) | ( RULE_ID ) );
    public final void rule__Generic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:683:1: ( ( ( rule__Generic__Group_0__0 ) ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==17) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==18||LA6_1==22) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTemplate.g:684:2: ( ( rule__Generic__Group_0__0 ) )
                    {
                    // InternalTemplate.g:684:2: ( ( rule__Generic__Group_0__0 ) )
                    // InternalTemplate.g:685:3: ( rule__Generic__Group_0__0 )
                    {
                     before(grammarAccess.getGenericAccess().getGroup_0()); 
                    // InternalTemplate.g:686:3: ( rule__Generic__Group_0__0 )
                    // InternalTemplate.g:686:4: rule__Generic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Generic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGenericAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:690:2: ( RULE_ID )
                    {
                    // InternalTemplate.g:690:2: ( RULE_ID )
                    // InternalTemplate.g:691:3: RULE_ID
                    {
                     before(grammarAccess.getGenericAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getGenericAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Alternatives"


    // $ANTLR start "rule__VarDeclaration__Alternatives_0"
    // InternalTemplate.g:700:1: rule__VarDeclaration__Alternatives_0 : ( ( ruleDataType ) | ( ruleObjectType ) );
    public final void rule__VarDeclaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:704:1: ( ( ruleDataType ) | ( ruleObjectType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTemplate.g:705:2: ( ruleDataType )
                    {
                    // InternalTemplate.g:705:2: ( ruleDataType )
                    // InternalTemplate.g:706:3: ruleDataType
                    {
                     before(grammarAccess.getVarDeclarationAccess().getDataTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getVarDeclarationAccess().getDataTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:711:2: ( ruleObjectType )
                    {
                    // InternalTemplate.g:711:2: ( ruleObjectType )
                    // InternalTemplate.g:712:3: ruleObjectType
                    {
                     before(grammarAccess.getVarDeclarationAccess().getObjectTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectType();

                    state._fsp--;

                     after(grammarAccess.getVarDeclarationAccess().getObjectTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Alternatives_0"


    // $ANTLR start "rule__ReturnType__Alternatives"
    // InternalTemplate.g:721:1: rule__ReturnType__Alternatives : ( ( ruleDataType ) | ( ruleGeneric ) );
    public final void rule__ReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:725:1: ( ( ruleDataType ) | ( ruleGeneric ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=13)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTemplate.g:726:2: ( ruleDataType )
                    {
                    // InternalTemplate.g:726:2: ( ruleDataType )
                    // InternalTemplate.g:727:3: ruleDataType
                    {
                     before(grammarAccess.getReturnTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getReturnTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:732:2: ( ruleGeneric )
                    {
                    // InternalTemplate.g:732:2: ( ruleGeneric )
                    // InternalTemplate.g:733:3: ruleGeneric
                    {
                     before(grammarAccess.getReturnTypeAccess().getGenericParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGeneric();

                    state._fsp--;

                     after(grammarAccess.getReturnTypeAccess().getGenericParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__Alternatives"


    // $ANTLR start "rule__AccessOperator__Alternatives_1"
    // InternalTemplate.g:742:1: rule__AccessOperator__Alternatives_1 : ( ( '.' ) | ( '->' ) );
    public final void rule__AccessOperator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:746:1: ( ( '.' ) | ( '->' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTemplate.g:747:2: ( '.' )
                    {
                    // InternalTemplate.g:747:2: ( '.' )
                    // InternalTemplate.g:748:3: '.'
                    {
                     before(grammarAccess.getAccessOperatorAccess().getFullStopKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAccessOperatorAccess().getFullStopKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:753:2: ( '->' )
                    {
                    // InternalTemplate.g:753:2: ( '->' )
                    // InternalTemplate.g:754:3: '->'
                    {
                     before(grammarAccess.getAccessOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAccessOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Alternatives_1"


    // $ANTLR start "rule__Function__Alternatives_5"
    // InternalTemplate.g:763:1: rule__Function__Alternatives_5 : ( ( ruleStatement ) | ( ruleLoop ) );
    public final void rule__Function__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:767:1: ( ( ruleStatement ) | ( ruleLoop ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=12 && LA10_0<=13)||LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTemplate.g:768:2: ( ruleStatement )
                    {
                    // InternalTemplate.g:768:2: ( ruleStatement )
                    // InternalTemplate.g:769:3: ruleStatement
                    {
                     before(grammarAccess.getFunctionAccess().getStatementParserRuleCall_5_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getStatementParserRuleCall_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:774:2: ( ruleLoop )
                    {
                    // InternalTemplate.g:774:2: ( ruleLoop )
                    // InternalTemplate.g:775:3: ruleLoop
                    {
                     before(grammarAccess.getFunctionAccess().getLoopParserRuleCall_5_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getFunctionAccess().getLoopParserRuleCall_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Alternatives_5"


    // $ANTLR start "rule__Statement__Alternatives_0"
    // InternalTemplate.g:784:1: rule__Statement__Alternatives_0 : ( ( ruleVarDeclaration ) | ( ruleVarAssign ) | ( ruleFunctionCall ) | ( ruleAccessOperator ) | ( ruleReturn ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:788:1: ( ( ruleVarDeclaration ) | ( ruleVarAssign ) | ( ruleFunctionCall ) | ( ruleAccessOperator ) | ( ruleReturn ) )
            int alt11=5;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalTemplate.g:789:2: ( ruleVarDeclaration )
                    {
                    // InternalTemplate.g:789:2: ( ruleVarDeclaration )
                    // InternalTemplate.g:790:3: ruleVarDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVarDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:795:2: ( ruleVarAssign )
                    {
                    // InternalTemplate.g:795:2: ( ruleVarAssign )
                    // InternalTemplate.g:796:3: ruleVarAssign
                    {
                     before(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVarAssign();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTemplate.g:801:2: ( ruleFunctionCall )
                    {
                    // InternalTemplate.g:801:2: ( ruleFunctionCall )
                    // InternalTemplate.g:802:3: ruleFunctionCall
                    {
                     before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTemplate.g:807:2: ( ruleAccessOperator )
                    {
                    // InternalTemplate.g:807:2: ( ruleAccessOperator )
                    // InternalTemplate.g:808:3: ruleAccessOperator
                    {
                     before(grammarAccess.getStatementAccess().getAccessOperatorParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAccessOperator();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAccessOperatorParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTemplate.g:813:2: ( ruleReturn )
                    {
                    // InternalTemplate.g:813:2: ( ruleReturn )
                    // InternalTemplate.g:814:3: ruleReturn
                    {
                     before(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleReturn();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_0"


    // $ANTLR start "rule__Include__Group__0"
    // InternalTemplate.g:823:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:827:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalTemplate.g:828:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalTemplate.g:835:1: rule__Include__Group__0__Impl : ( '#include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:839:1: ( ( '#include' ) )
            // InternalTemplate.g:840:1: ( '#include' )
            {
            // InternalTemplate.g:840:1: ( '#include' )
            // InternalTemplate.g:841:2: '#include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalTemplate.g:850:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:854:1: ( rule__Include__Group__1__Impl )
            // InternalTemplate.g:855:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalTemplate.g:861:1: rule__Include__Group__1__Impl : ( ruleFile ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:865:1: ( ( ruleFile ) )
            // InternalTemplate.g:866:1: ( ruleFile )
            {
            // InternalTemplate.g:866:1: ( ruleFile )
            // InternalTemplate.g:867:2: ruleFile
            {
             before(grammarAccess.getIncludeAccess().getFileParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getFileParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__File__Group__0"
    // InternalTemplate.g:877:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:881:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalTemplate.g:882:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalTemplate.g:889:1: rule__File__Group__0__Impl : ( '<' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:893:1: ( ( '<' ) )
            // InternalTemplate.g:894:1: ( '<' )
            {
            // InternalTemplate.g:894:1: ( '<' )
            // InternalTemplate.g:895:2: '<'
            {
             before(grammarAccess.getFileAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalTemplate.g:904:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:908:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalTemplate.g:909:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalTemplate.g:916:1: rule__File__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:920:1: ( ( RULE_ID ) )
            // InternalTemplate.g:921:1: ( RULE_ID )
            {
            // InternalTemplate.g:921:1: ( RULE_ID )
            // InternalTemplate.g:922:2: RULE_ID
            {
             before(grammarAccess.getFileAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalTemplate.g:931:1: rule__File__Group__2 : rule__File__Group__2__Impl ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:935:1: ( rule__File__Group__2__Impl )
            // InternalTemplate.g:936:2: rule__File__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalTemplate.g:942:1: rule__File__Group__2__Impl : ( '>' ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:946:1: ( ( '>' ) )
            // InternalTemplate.g:947:1: ( '>' )
            {
            // InternalTemplate.g:947:1: ( '>' )
            // InternalTemplate.g:948:2: '>'
            {
             before(grammarAccess.getFileAccess().getGreaterThanSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalTemplate.g:958:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:962:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalTemplate.g:963:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalTemplate.g:970:1: rule__Namespace__Group__0__Impl : ( 'using' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:974:1: ( ( 'using' ) )
            // InternalTemplate.g:975:1: ( 'using' )
            {
            // InternalTemplate.g:975:1: ( 'using' )
            // InternalTemplate.g:976:2: 'using'
            {
             before(grammarAccess.getNamespaceAccess().getUsingKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getUsingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalTemplate.g:985:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:989:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalTemplate.g:990:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalTemplate.g:997:1: rule__Namespace__Group__1__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1001:1: ( ( 'namespace' ) )
            // InternalTemplate.g:1002:1: ( 'namespace' )
            {
            // InternalTemplate.g:1002:1: ( 'namespace' )
            // InternalTemplate.g:1003:2: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // InternalTemplate.g:1012:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1016:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // InternalTemplate.g:1017:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // InternalTemplate.g:1024:1: rule__Namespace__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1028:1: ( ( RULE_ID ) )
            // InternalTemplate.g:1029:1: ( RULE_ID )
            {
            // InternalTemplate.g:1029:1: ( RULE_ID )
            // InternalTemplate.g:1030:2: RULE_ID
            {
             before(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // InternalTemplate.g:1039:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1043:1: ( rule__Namespace__Group__3__Impl )
            // InternalTemplate.g:1044:2: rule__Namespace__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // InternalTemplate.g:1050:1: rule__Namespace__Group__3__Impl : ( ruleEnd ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1054:1: ( ( ruleEnd ) )
            // InternalTemplate.g:1055:1: ( ruleEnd )
            {
            // InternalTemplate.g:1055:1: ( ruleEnd )
            // InternalTemplate.g:1056:2: ruleEnd
            {
             before(grammarAccess.getNamespaceAccess().getEndParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getEndParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalTemplate.g:1066:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1070:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalTemplate.g:1071:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalTemplate.g:1078:1: rule__Loop__Group__0__Impl : ( 'while' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1082:1: ( ( 'while' ) )
            // InternalTemplate.g:1083:1: ( 'while' )
            {
            // InternalTemplate.g:1083:1: ( 'while' )
            // InternalTemplate.g:1084:2: 'while'
            {
             before(grammarAccess.getLoopAccess().getWhileKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalTemplate.g:1093:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1097:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalTemplate.g:1098:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalTemplate.g:1105:1: rule__Loop__Group__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1109:1: ( ( '(' ) )
            // InternalTemplate.g:1110:1: ( '(' )
            {
            // InternalTemplate.g:1110:1: ( '(' )
            // InternalTemplate.g:1111:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalTemplate.g:1120:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1124:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalTemplate.g:1125:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalTemplate.g:1132:1: rule__Loop__Group__2__Impl : ( ruleBoolean ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1136:1: ( ( ruleBoolean ) )
            // InternalTemplate.g:1137:1: ( ruleBoolean )
            {
            // InternalTemplate.g:1137:1: ( ruleBoolean )
            // InternalTemplate.g:1138:2: ruleBoolean
            {
             before(grammarAccess.getLoopAccess().getBooleanParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getBooleanParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalTemplate.g:1147:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1151:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalTemplate.g:1152:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalTemplate.g:1159:1: rule__Loop__Group__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1163:1: ( ( ')' ) )
            // InternalTemplate.g:1164:1: ( ')' )
            {
            // InternalTemplate.g:1164:1: ( ')' )
            // InternalTemplate.g:1165:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalTemplate.g:1174:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1178:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalTemplate.g:1179:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalTemplate.g:1186:1: rule__Loop__Group__4__Impl : ( '{' ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1190:1: ( ( '{' ) )
            // InternalTemplate.g:1191:1: ( '{' )
            {
            // InternalTemplate.g:1191:1: ( '{' )
            // InternalTemplate.g:1192:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalTemplate.g:1201:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1205:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalTemplate.g:1206:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalTemplate.g:1213:1: rule__Loop__Group__5__Impl : ( ( ruleStatement )* ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1217:1: ( ( ( ruleStatement )* ) )
            // InternalTemplate.g:1218:1: ( ( ruleStatement )* )
            {
            // InternalTemplate.g:1218:1: ( ( ruleStatement )* )
            // InternalTemplate.g:1219:2: ( ruleStatement )*
            {
             before(grammarAccess.getLoopAccess().getStatementParserRuleCall_5()); 
            // InternalTemplate.g:1220:2: ( ruleStatement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=12 && LA12_0<=13)||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTemplate.g:1220:3: ruleStatement
            	    {
            	    pushFollow(FOLLOW_14);
            	    ruleStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getStatementParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalTemplate.g:1228:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1232:1: ( rule__Loop__Group__6__Impl )
            // InternalTemplate.g:1233:2: rule__Loop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalTemplate.g:1239:1: rule__Loop__Group__6__Impl : ( '}' ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1243:1: ( ( '}' ) )
            // InternalTemplate.g:1244:1: ( '}' )
            {
            // InternalTemplate.g:1244:1: ( '}' )
            // InternalTemplate.g:1245:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalTemplate.g:1255:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1259:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalTemplate.g:1260:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalTemplate.g:1267:1: rule__Boolean__Group__0__Impl : ( '!' ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1271:1: ( ( '!' ) )
            // InternalTemplate.g:1272:1: ( '!' )
            {
            // InternalTemplate.g:1272:1: ( '!' )
            // InternalTemplate.g:1273:2: '!'
            {
             before(grammarAccess.getBooleanAccess().getExclamationMarkKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalTemplate.g:1282:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1286:1: ( rule__Boolean__Group__1__Impl )
            // InternalTemplate.g:1287:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalTemplate.g:1293:1: rule__Boolean__Group__1__Impl : ( ruleAccessOperator ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1297:1: ( ( ruleAccessOperator ) )
            // InternalTemplate.g:1298:1: ( ruleAccessOperator )
            {
            // InternalTemplate.g:1298:1: ( ruleAccessOperator )
            // InternalTemplate.g:1299:2: ruleAccessOperator
            {
             before(grammarAccess.getBooleanAccess().getAccessOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAccessOperator();

            state._fsp--;

             after(grammarAccess.getBooleanAccess().getAccessOperatorParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // InternalTemplate.g:1309:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1313:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // InternalTemplate.g:1314:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Return__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Return__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // InternalTemplate.g:1321:1: rule__Return__Group__0__Impl : ( 'return' ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1325:1: ( ( 'return' ) )
            // InternalTemplate.g:1326:1: ( 'return' )
            {
            // InternalTemplate.g:1326:1: ( 'return' )
            // InternalTemplate.g:1327:2: 'return'
            {
             before(grammarAccess.getReturnAccess().getReturnKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReturnAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // InternalTemplate.g:1336:1: rule__Return__Group__1 : rule__Return__Group__1__Impl ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1340:1: ( rule__Return__Group__1__Impl )
            // InternalTemplate.g:1341:2: rule__Return__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // InternalTemplate.g:1347:1: rule__Return__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1351:1: ( ( RULE_ID ) )
            // InternalTemplate.g:1352:1: ( RULE_ID )
            {
            // InternalTemplate.g:1352:1: ( RULE_ID )
            // InternalTemplate.g:1353:2: RULE_ID
            {
             before(grammarAccess.getReturnAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReturnAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__ArgumentList__Group_3__0"
    // InternalTemplate.g:1363:1: rule__ArgumentList__Group_3__0 : rule__ArgumentList__Group_3__0__Impl rule__ArgumentList__Group_3__1 ;
    public final void rule__ArgumentList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1367:1: ( rule__ArgumentList__Group_3__0__Impl rule__ArgumentList__Group_3__1 )
            // InternalTemplate.g:1368:2: rule__ArgumentList__Group_3__0__Impl rule__ArgumentList__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__ArgumentList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgumentList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_3__0"


    // $ANTLR start "rule__ArgumentList__Group_3__0__Impl"
    // InternalTemplate.g:1375:1: rule__ArgumentList__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ArgumentList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1379:1: ( ( ',' ) )
            // InternalTemplate.g:1380:1: ( ',' )
            {
            // InternalTemplate.g:1380:1: ( ',' )
            // InternalTemplate.g:1381:2: ','
            {
             before(grammarAccess.getArgumentListAccess().getCommaKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getArgumentListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_3__0__Impl"


    // $ANTLR start "rule__ArgumentList__Group_3__1"
    // InternalTemplate.g:1390:1: rule__ArgumentList__Group_3__1 : rule__ArgumentList__Group_3__1__Impl ;
    public final void rule__ArgumentList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1394:1: ( rule__ArgumentList__Group_3__1__Impl )
            // InternalTemplate.g:1395:2: rule__ArgumentList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgumentList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_3__1"


    // $ANTLR start "rule__ArgumentList__Group_3__1__Impl"
    // InternalTemplate.g:1401:1: rule__ArgumentList__Group_3__1__Impl : ( ruleArgumentList ) ;
    public final void rule__ArgumentList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1405:1: ( ( ruleArgumentList ) )
            // InternalTemplate.g:1406:1: ( ruleArgumentList )
            {
            // InternalTemplate.g:1406:1: ( ruleArgumentList )
            // InternalTemplate.g:1407:2: ruleArgumentList
            {
             before(grammarAccess.getArgumentListAccess().getArgumentListParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleArgumentList();

            state._fsp--;

             after(grammarAccess.getArgumentListAccess().getArgumentListParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgumentList__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__0"
    // InternalTemplate.g:1417:1: rule__FunctionCall__Group_1__0 : rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 ;
    public final void rule__FunctionCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1421:1: ( rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1 )
            // InternalTemplate.g:1422:2: rule__FunctionCall__Group_1__0__Impl rule__FunctionCall__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__FunctionCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0"


    // $ANTLR start "rule__FunctionCall__Group_1__0__Impl"
    // InternalTemplate.g:1429:1: rule__FunctionCall__Group_1__0__Impl : ( ruleGeneric ) ;
    public final void rule__FunctionCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1433:1: ( ( ruleGeneric ) )
            // InternalTemplate.g:1434:1: ( ruleGeneric )
            {
            // InternalTemplate.g:1434:1: ( ruleGeneric )
            // InternalTemplate.g:1435:2: ruleGeneric
            {
             before(grammarAccess.getFunctionCallAccess().getGenericParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneric();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getGenericParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__1"
    // InternalTemplate.g:1444:1: rule__FunctionCall__Group_1__1 : rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 ;
    public final void rule__FunctionCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1448:1: ( rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2 )
            // InternalTemplate.g:1449:2: rule__FunctionCall__Group_1__1__Impl rule__FunctionCall__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__FunctionCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1"


    // $ANTLR start "rule__FunctionCall__Group_1__1__Impl"
    // InternalTemplate.g:1456:1: rule__FunctionCall__Group_1__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1460:1: ( ( '(' ) )
            // InternalTemplate.g:1461:1: ( '(' )
            {
            // InternalTemplate.g:1461:1: ( '(' )
            // InternalTemplate.g:1462:2: '('
            {
             before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__2"
    // InternalTemplate.g:1471:1: rule__FunctionCall__Group_1__2 : rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 ;
    public final void rule__FunctionCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1475:1: ( rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3 )
            // InternalTemplate.g:1476:2: rule__FunctionCall__Group_1__2__Impl rule__FunctionCall__Group_1__3
            {
            pushFollow(FOLLOW_17);
            rule__FunctionCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2"


    // $ANTLR start "rule__FunctionCall__Group_1__2__Impl"
    // InternalTemplate.g:1483:1: rule__FunctionCall__Group_1__2__Impl : ( ( ruleArgumentList )* ) ;
    public final void rule__FunctionCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1487:1: ( ( ( ruleArgumentList )* ) )
            // InternalTemplate.g:1488:1: ( ( ruleArgumentList )* )
            {
            // InternalTemplate.g:1488:1: ( ( ruleArgumentList )* )
            // InternalTemplate.g:1489:2: ( ruleArgumentList )*
            {
             before(grammarAccess.getFunctionCallAccess().getArgumentListParserRuleCall_1_2()); 
            // InternalTemplate.g:1490:2: ( ruleArgumentList )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTemplate.g:1490:3: ruleArgumentList
            	    {
            	    pushFollow(FOLLOW_18);
            	    ruleArgumentList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getArgumentListParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group_1__3"
    // InternalTemplate.g:1498:1: rule__FunctionCall__Group_1__3 : rule__FunctionCall__Group_1__3__Impl ;
    public final void rule__FunctionCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1502:1: ( rule__FunctionCall__Group_1__3__Impl )
            // InternalTemplate.g:1503:2: rule__FunctionCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3"


    // $ANTLR start "rule__FunctionCall__Group_1__3__Impl"
    // InternalTemplate.g:1509:1: rule__FunctionCall__Group_1__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1513:1: ( ( ')' ) )
            // InternalTemplate.g:1514:1: ( ')' )
            {
            // InternalTemplate.g:1514:1: ( ')' )
            // InternalTemplate.g:1515:2: ')'
            {
             before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_1__3__Impl"


    // $ANTLR start "rule__Generic__Group_0__0"
    // InternalTemplate.g:1525:1: rule__Generic__Group_0__0 : rule__Generic__Group_0__0__Impl rule__Generic__Group_0__1 ;
    public final void rule__Generic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1529:1: ( rule__Generic__Group_0__0__Impl rule__Generic__Group_0__1 )
            // InternalTemplate.g:1530:2: rule__Generic__Group_0__0__Impl rule__Generic__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Generic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generic__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__0"


    // $ANTLR start "rule__Generic__Group_0__0__Impl"
    // InternalTemplate.g:1537:1: rule__Generic__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__Generic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1541:1: ( ( RULE_ID ) )
            // InternalTemplate.g:1542:1: ( RULE_ID )
            {
            // InternalTemplate.g:1542:1: ( RULE_ID )
            // InternalTemplate.g:1543:2: RULE_ID
            {
             before(grammarAccess.getGenericAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGenericAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__0__Impl"


    // $ANTLR start "rule__Generic__Group_0__1"
    // InternalTemplate.g:1552:1: rule__Generic__Group_0__1 : rule__Generic__Group_0__1__Impl rule__Generic__Group_0__2 ;
    public final void rule__Generic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1556:1: ( rule__Generic__Group_0__1__Impl rule__Generic__Group_0__2 )
            // InternalTemplate.g:1557:2: rule__Generic__Group_0__1__Impl rule__Generic__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Generic__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generic__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__1"


    // $ANTLR start "rule__Generic__Group_0__1__Impl"
    // InternalTemplate.g:1564:1: rule__Generic__Group_0__1__Impl : ( '<' ) ;
    public final void rule__Generic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1568:1: ( ( '<' ) )
            // InternalTemplate.g:1569:1: ( '<' )
            {
            // InternalTemplate.g:1569:1: ( '<' )
            // InternalTemplate.g:1570:2: '<'
            {
             before(grammarAccess.getGenericAccess().getLessThanSignKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGenericAccess().getLessThanSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__1__Impl"


    // $ANTLR start "rule__Generic__Group_0__2"
    // InternalTemplate.g:1579:1: rule__Generic__Group_0__2 : rule__Generic__Group_0__2__Impl rule__Generic__Group_0__3 ;
    public final void rule__Generic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1583:1: ( rule__Generic__Group_0__2__Impl rule__Generic__Group_0__3 )
            // InternalTemplate.g:1584:2: rule__Generic__Group_0__2__Impl rule__Generic__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Generic__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Generic__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__2"


    // $ANTLR start "rule__Generic__Group_0__2__Impl"
    // InternalTemplate.g:1591:1: rule__Generic__Group_0__2__Impl : ( ruleGeneric ) ;
    public final void rule__Generic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1595:1: ( ( ruleGeneric ) )
            // InternalTemplate.g:1596:1: ( ruleGeneric )
            {
            // InternalTemplate.g:1596:1: ( ruleGeneric )
            // InternalTemplate.g:1597:2: ruleGeneric
            {
             before(grammarAccess.getGenericAccess().getGenericParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleGeneric();

            state._fsp--;

             after(grammarAccess.getGenericAccess().getGenericParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__2__Impl"


    // $ANTLR start "rule__Generic__Group_0__3"
    // InternalTemplate.g:1606:1: rule__Generic__Group_0__3 : rule__Generic__Group_0__3__Impl ;
    public final void rule__Generic__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1610:1: ( rule__Generic__Group_0__3__Impl )
            // InternalTemplate.g:1611:2: rule__Generic__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Generic__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__3"


    // $ANTLR start "rule__Generic__Group_0__3__Impl"
    // InternalTemplate.g:1617:1: rule__Generic__Group_0__3__Impl : ( '>' ) ;
    public final void rule__Generic__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1621:1: ( ( '>' ) )
            // InternalTemplate.g:1622:1: ( '>' )
            {
            // InternalTemplate.g:1622:1: ( '>' )
            // InternalTemplate.g:1623:2: '>'
            {
             before(grammarAccess.getGenericAccess().getGreaterThanSignKeyword_0_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGenericAccess().getGreaterThanSignKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generic__Group_0__3__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__0"
    // InternalTemplate.g:1633:1: rule__VarDeclaration__Group__0 : rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 ;
    public final void rule__VarDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1637:1: ( rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1 )
            // InternalTemplate.g:1638:2: rule__VarDeclaration__Group__0__Impl rule__VarDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VarDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0"


    // $ANTLR start "rule__VarDeclaration__Group__0__Impl"
    // InternalTemplate.g:1645:1: rule__VarDeclaration__Group__0__Impl : ( ( rule__VarDeclaration__Alternatives_0 ) ) ;
    public final void rule__VarDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1649:1: ( ( ( rule__VarDeclaration__Alternatives_0 ) ) )
            // InternalTemplate.g:1650:1: ( ( rule__VarDeclaration__Alternatives_0 ) )
            {
            // InternalTemplate.g:1650:1: ( ( rule__VarDeclaration__Alternatives_0 ) )
            // InternalTemplate.g:1651:2: ( rule__VarDeclaration__Alternatives_0 )
            {
             before(grammarAccess.getVarDeclarationAccess().getAlternatives_0()); 
            // InternalTemplate.g:1652:2: ( rule__VarDeclaration__Alternatives_0 )
            // InternalTemplate.g:1652:3: rule__VarDeclaration__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclarationAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarDeclaration__Group__1"
    // InternalTemplate.g:1660:1: rule__VarDeclaration__Group__1 : rule__VarDeclaration__Group__1__Impl ;
    public final void rule__VarDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1664:1: ( rule__VarDeclaration__Group__1__Impl )
            // InternalTemplate.g:1665:2: rule__VarDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1"


    // $ANTLR start "rule__VarDeclaration__Group__1__Impl"
    // InternalTemplate.g:1671:1: rule__VarDeclaration__Group__1__Impl : ( ruleVarName ) ;
    public final void rule__VarDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1675:1: ( ( ruleVarName ) )
            // InternalTemplate.g:1676:1: ( ruleVarName )
            {
            // InternalTemplate.g:1676:1: ( ruleVarName )
            // InternalTemplate.g:1677:2: ruleVarName
            {
             before(grammarAccess.getVarDeclarationAccess().getVarNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleVarName();

            state._fsp--;

             after(grammarAccess.getVarDeclarationAccess().getVarNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarAssign__Group__0"
    // InternalTemplate.g:1687:1: rule__VarAssign__Group__0 : rule__VarAssign__Group__0__Impl rule__VarAssign__Group__1 ;
    public final void rule__VarAssign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1691:1: ( rule__VarAssign__Group__0__Impl rule__VarAssign__Group__1 )
            // InternalTemplate.g:1692:2: rule__VarAssign__Group__0__Impl rule__VarAssign__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__VarAssign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__0"


    // $ANTLR start "rule__VarAssign__Group__0__Impl"
    // InternalTemplate.g:1699:1: rule__VarAssign__Group__0__Impl : ( ruleVarDeclaration ) ;
    public final void rule__VarAssign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1703:1: ( ( ruleVarDeclaration ) )
            // InternalTemplate.g:1704:1: ( ruleVarDeclaration )
            {
            // InternalTemplate.g:1704:1: ( ruleVarDeclaration )
            // InternalTemplate.g:1705:2: ruleVarDeclaration
            {
             before(grammarAccess.getVarAssignAccess().getVarDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDeclaration();

            state._fsp--;

             after(grammarAccess.getVarAssignAccess().getVarDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__0__Impl"


    // $ANTLR start "rule__VarAssign__Group__1"
    // InternalTemplate.g:1714:1: rule__VarAssign__Group__1 : rule__VarAssign__Group__1__Impl rule__VarAssign__Group__2 ;
    public final void rule__VarAssign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1718:1: ( rule__VarAssign__Group__1__Impl rule__VarAssign__Group__2 )
            // InternalTemplate.g:1719:2: rule__VarAssign__Group__1__Impl rule__VarAssign__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__VarAssign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__1"


    // $ANTLR start "rule__VarAssign__Group__1__Impl"
    // InternalTemplate.g:1726:1: rule__VarAssign__Group__1__Impl : ( '=' ) ;
    public final void rule__VarAssign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1730:1: ( ( '=' ) )
            // InternalTemplate.g:1731:1: ( '=' )
            {
            // InternalTemplate.g:1731:1: ( '=' )
            // InternalTemplate.g:1732:2: '='
            {
             before(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__1__Impl"


    // $ANTLR start "rule__VarAssign__Group__2"
    // InternalTemplate.g:1741:1: rule__VarAssign__Group__2 : rule__VarAssign__Group__2__Impl ;
    public final void rule__VarAssign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1745:1: ( rule__VarAssign__Group__2__Impl )
            // InternalTemplate.g:1746:2: rule__VarAssign__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssign__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__2"


    // $ANTLR start "rule__VarAssign__Group__2__Impl"
    // InternalTemplate.g:1752:1: rule__VarAssign__Group__2__Impl : ( ruleFunctionCall ) ;
    public final void rule__VarAssign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1756:1: ( ( ruleFunctionCall ) )
            // InternalTemplate.g:1757:1: ( ruleFunctionCall )
            {
            // InternalTemplate.g:1757:1: ( ruleFunctionCall )
            // InternalTemplate.g:1758:2: ruleFunctionCall
            {
             before(grammarAccess.getVarAssignAccess().getFunctionCallParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getVarAssignAccess().getFunctionCallParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssign__Group__2__Impl"


    // $ANTLR start "rule__AccessOperator__Group__0"
    // InternalTemplate.g:1768:1: rule__AccessOperator__Group__0 : rule__AccessOperator__Group__0__Impl rule__AccessOperator__Group__1 ;
    public final void rule__AccessOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1772:1: ( rule__AccessOperator__Group__0__Impl rule__AccessOperator__Group__1 )
            // InternalTemplate.g:1773:2: rule__AccessOperator__Group__0__Impl rule__AccessOperator__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AccessOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessOperator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Group__0"


    // $ANTLR start "rule__AccessOperator__Group__0__Impl"
    // InternalTemplate.g:1780:1: rule__AccessOperator__Group__0__Impl : ( ruleObjectType ) ;
    public final void rule__AccessOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1784:1: ( ( ruleObjectType ) )
            // InternalTemplate.g:1785:1: ( ruleObjectType )
            {
            // InternalTemplate.g:1785:1: ( ruleObjectType )
            // InternalTemplate.g:1786:2: ruleObjectType
            {
             before(grammarAccess.getAccessOperatorAccess().getObjectTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectType();

            state._fsp--;

             after(grammarAccess.getAccessOperatorAccess().getObjectTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Group__0__Impl"


    // $ANTLR start "rule__AccessOperator__Group__1"
    // InternalTemplate.g:1795:1: rule__AccessOperator__Group__1 : rule__AccessOperator__Group__1__Impl rule__AccessOperator__Group__2 ;
    public final void rule__AccessOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1799:1: ( rule__AccessOperator__Group__1__Impl rule__AccessOperator__Group__2 )
            // InternalTemplate.g:1800:2: rule__AccessOperator__Group__1__Impl rule__AccessOperator__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AccessOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AccessOperator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Group__1"


    // $ANTLR start "rule__AccessOperator__Group__1__Impl"
    // InternalTemplate.g:1807:1: rule__AccessOperator__Group__1__Impl : ( ( rule__AccessOperator__Alternatives_1 ) ) ;
    public final void rule__AccessOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1811:1: ( ( ( rule__AccessOperator__Alternatives_1 ) ) )
            // InternalTemplate.g:1812:1: ( ( rule__AccessOperator__Alternatives_1 ) )
            {
            // InternalTemplate.g:1812:1: ( ( rule__AccessOperator__Alternatives_1 ) )
            // InternalTemplate.g:1813:2: ( rule__AccessOperator__Alternatives_1 )
            {
             before(grammarAccess.getAccessOperatorAccess().getAlternatives_1()); 
            // InternalTemplate.g:1814:2: ( rule__AccessOperator__Alternatives_1 )
            // InternalTemplate.g:1814:3: rule__AccessOperator__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AccessOperator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessOperatorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Group__1__Impl"


    // $ANTLR start "rule__AccessOperator__Group__2"
    // InternalTemplate.g:1822:1: rule__AccessOperator__Group__2 : rule__AccessOperator__Group__2__Impl ;
    public final void rule__AccessOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1826:1: ( rule__AccessOperator__Group__2__Impl )
            // InternalTemplate.g:1827:2: rule__AccessOperator__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AccessOperator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Group__2"


    // $ANTLR start "rule__AccessOperator__Group__2__Impl"
    // InternalTemplate.g:1833:1: rule__AccessOperator__Group__2__Impl : ( ruleFunctionCall ) ;
    public final void rule__AccessOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1837:1: ( ( ruleFunctionCall ) )
            // InternalTemplate.g:1838:1: ( ruleFunctionCall )
            {
            // InternalTemplate.g:1838:1: ( ruleFunctionCall )
            // InternalTemplate.g:1839:2: ruleFunctionCall
            {
             before(grammarAccess.getAccessOperatorAccess().getFunctionCallParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getAccessOperatorAccess().getFunctionCallParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccessOperator__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalTemplate.g:1849:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1853:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalTemplate.g:1854:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalTemplate.g:1861:1: rule__Function__Group__0__Impl : ( ruleReturnType ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1865:1: ( ( ruleReturnType ) )
            // InternalTemplate.g:1866:1: ( ruleReturnType )
            {
            // InternalTemplate.g:1866:1: ( ruleReturnType )
            // InternalTemplate.g:1867:2: ruleReturnType
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getReturnTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalTemplate.g:1876:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1880:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalTemplate.g:1881:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalTemplate.g:1888:1: rule__Function__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1892:1: ( ( RULE_ID ) )
            // InternalTemplate.g:1893:1: ( RULE_ID )
            {
            // InternalTemplate.g:1893:1: ( RULE_ID )
            // InternalTemplate.g:1894:2: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalTemplate.g:1903:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1907:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalTemplate.g:1908:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalTemplate.g:1915:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1919:1: ( ( '(' ) )
            // InternalTemplate.g:1920:1: ( '(' )
            {
            // InternalTemplate.g:1920:1: ( '(' )
            // InternalTemplate.g:1921:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalTemplate.g:1930:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1934:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalTemplate.g:1935:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalTemplate.g:1942:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1946:1: ( ( ')' ) )
            // InternalTemplate.g:1947:1: ( ')' )
            {
            // InternalTemplate.g:1947:1: ( ')' )
            // InternalTemplate.g:1948:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalTemplate.g:1957:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1961:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalTemplate.g:1962:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalTemplate.g:1969:1: rule__Function__Group__4__Impl : ( '{' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1973:1: ( ( '{' ) )
            // InternalTemplate.g:1974:1: ( '{' )
            {
            // InternalTemplate.g:1974:1: ( '{' )
            // InternalTemplate.g:1975:2: '{'
            {
             before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalTemplate.g:1984:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:1988:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalTemplate.g:1989:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalTemplate.g:1996:1: rule__Function__Group__5__Impl : ( ( rule__Function__Alternatives_5 )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2000:1: ( ( ( rule__Function__Alternatives_5 )* ) )
            // InternalTemplate.g:2001:1: ( ( rule__Function__Alternatives_5 )* )
            {
            // InternalTemplate.g:2001:1: ( ( rule__Function__Alternatives_5 )* )
            // InternalTemplate.g:2002:2: ( rule__Function__Alternatives_5 )*
            {
             before(grammarAccess.getFunctionAccess().getAlternatives_5()); 
            // InternalTemplate.g:2003:2: ( rule__Function__Alternatives_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=12 && LA14_0<=13)||LA14_0==21||LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTemplate.g:2003:3: rule__Function__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Function__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalTemplate.g:2011:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2015:1: ( rule__Function__Group__6__Impl )
            // InternalTemplate.g:2016:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalTemplate.g:2022:1: rule__Function__Group__6__Impl : ( '}' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2026:1: ( ( '}' ) )
            // InternalTemplate.g:2027:1: ( '}' )
            {
            // InternalTemplate.g:2027:1: ( '}' )
            // InternalTemplate.g:2028:2: '}'
            {
             before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalTemplate.g:2038:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2042:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalTemplate.g:2043:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalTemplate.g:2050:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2054:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalTemplate.g:2055:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalTemplate.g:2055:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalTemplate.g:2056:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalTemplate.g:2057:2: ( rule__Statement__Alternatives_0 )
            // InternalTemplate.g:2057:3: rule__Statement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalTemplate.g:2065:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2069:1: ( rule__Statement__Group__1__Impl )
            // InternalTemplate.g:2070:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalTemplate.g:2076:1: rule__Statement__Group__1__Impl : ( ruleEnd ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2080:1: ( ( ruleEnd ) )
            // InternalTemplate.g:2081:1: ( ruleEnd )
            {
            // InternalTemplate.g:2081:1: ( ruleEnd )
            // InternalTemplate.g:2082:2: ruleEnd
            {
             before(grammarAccess.getStatementAccess().getEndParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getEndParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Template__ElementsAssignment"
    // InternalTemplate.g:2092:1: rule__Template__ElementsAssignment : ( ruleType ) ;
    public final void rule__Template__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemplate.g:2096:1: ( ( ruleType ) )
            // InternalTemplate.g:2097:2: ( ruleType )
            {
            // InternalTemplate.g:2097:2: ( ruleType )
            // InternalTemplate.g:2098:3: ruleType
            {
             before(grammarAccess.getTemplateAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__ElementsAssignment"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\4\1\uffff\1\13\4\uffff";
    static final String dfa_3s = "\1\33\2\4\1\26\1\uffff\1\35\4\uffff";
    static final String dfa_4s = "\4\uffff\1\5\1\uffff\1\3\1\4\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\7\uffff\1\1\1\2\15\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\5\6\uffff\1\6\2\uffff\2\7\1\uffff\1\6\4\uffff\1\6",
            "",
            "\1\11\21\uffff\1\10",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "784:1: rule__Statement__Alternatives_0 : ( ( ruleVarDeclaration ) | ( ruleVarAssign ) | ( ruleFunctionCall ) | ( ruleAccessOperator ) | ( ruleReturn ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000093012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000A093010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008093012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010800070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000072L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000093010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000A293010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008293012L});

}