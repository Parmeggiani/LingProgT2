package org.xtext.template.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.template.services.TemplateGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemplateParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "'<'", "'>'", "'using'", "'namespace'", "'auto'", "'void'", "'while'", "'('", "')'", "'{'", "'}'", "'!'", "'return'", "','", "'='", "'.'", "'->'", "';'"
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

        public InternalTemplateParser(TokenStream input, TemplateGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Template";
       	}

       	@Override
       	protected TemplateGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTemplate"
    // InternalTemplate.g:64:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalTemplate.g:64:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalTemplate.g:65:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalTemplate.g:71:1: ruleTemplate returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTemplate.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalTemplate.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalTemplate.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTemplate.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalTemplate.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalTemplate.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getTemplateAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.template.Template.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleType"
    // InternalTemplate.g:100:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalTemplate.g:100:44: (iv_ruleType= ruleType EOF )
            // InternalTemplate.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTemplate.g:107:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Include_0= ruleInclude | this_Namespace_1= ruleNamespace | this_Function_2= ruleFunction ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Include_0 = null;

        AntlrDatatypeRuleToken this_Namespace_1 = null;

        AntlrDatatypeRuleToken this_Function_2 = null;



        	enterRule();

        try {
            // InternalTemplate.g:113:2: ( (this_Include_0= ruleInclude | this_Namespace_1= ruleNamespace | this_Function_2= ruleFunction ) )
            // InternalTemplate.g:114:2: (this_Include_0= ruleInclude | this_Namespace_1= ruleNamespace | this_Function_2= ruleFunction )
            {
            // InternalTemplate.g:114:2: (this_Include_0= ruleInclude | this_Namespace_1= ruleNamespace | this_Function_2= ruleFunction )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case 16:
            case 17:
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
                    // InternalTemplate.g:115:3: this_Include_0= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIncludeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_0=ruleInclude();

                    state._fsp--;


                    			current.merge(this_Include_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:126:3: this_Namespace_1= ruleNamespace
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getNamespaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Namespace_1=ruleNamespace();

                    state._fsp--;


                    			current.merge(this_Namespace_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTemplate.g:137:3: this_Function_2= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_2=ruleFunction();

                    state._fsp--;


                    			current.merge(this_Function_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInclude"
    // InternalTemplate.g:151:1: entryRuleInclude returns [String current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final String entryRuleInclude() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInclude = null;


        try {
            // InternalTemplate.g:151:47: (iv_ruleInclude= ruleInclude EOF )
            // InternalTemplate.g:152:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalTemplate.g:158:1: ruleInclude returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#include' this_File_1= ruleFile ) ;
    public final AntlrDatatypeRuleToken ruleInclude() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_File_1 = null;



        	enterRule();

        try {
            // InternalTemplate.g:164:2: ( (kw= '#include' this_File_1= ruleFile ) )
            // InternalTemplate.g:165:2: (kw= '#include' this_File_1= ruleFile )
            {
            // InternalTemplate.g:165:2: (kw= '#include' this_File_1= ruleFile )
            // InternalTemplate.g:166:3: kw= '#include' this_File_1= ruleFile
            {
            kw=(Token)match(input,11,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getIncludeAccess().getFileParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_File_1=ruleFile();

            state._fsp--;


            			current.merge(this_File_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleFile"
    // InternalTemplate.g:185:1: entryRuleFile returns [String current=null] : iv_ruleFile= ruleFile EOF ;
    public final String entryRuleFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFile = null;


        try {
            // InternalTemplate.g:185:44: (iv_ruleFile= ruleFile EOF )
            // InternalTemplate.g:186:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalTemplate.g:192:1: ruleFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' this_ID_1= RULE_ID kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTemplate.g:198:2: ( (kw= '<' this_ID_1= RULE_ID kw= '>' ) )
            // InternalTemplate.g:199:2: (kw= '<' this_ID_1= RULE_ID kw= '>' )
            {
            // InternalTemplate.g:199:2: (kw= '<' this_ID_1= RULE_ID kw= '>' )
            // InternalTemplate.g:200:3: kw= '<' this_ID_1= RULE_ID kw= '>'
            {
            kw=(Token)match(input,12,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFileAccess().getLessThanSignKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getFileAccess().getIDTerminalRuleCall_1());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFileAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleNamespace"
    // InternalTemplate.g:221:1: entryRuleNamespace returns [String current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final String entryRuleNamespace() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespace = null;


        try {
            // InternalTemplate.g:221:49: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalTemplate.g:222:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalTemplate.g:228:1: ruleNamespace returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'using' kw= 'namespace' this_ID_2= RULE_ID this_End_3= ruleEnd ) ;
    public final AntlrDatatypeRuleToken ruleNamespace() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_End_3 = null;



        	enterRule();

        try {
            // InternalTemplate.g:234:2: ( (kw= 'using' kw= 'namespace' this_ID_2= RULE_ID this_End_3= ruleEnd ) )
            // InternalTemplate.g:235:2: (kw= 'using' kw= 'namespace' this_ID_2= RULE_ID this_End_3= ruleEnd )
            {
            // InternalTemplate.g:235:2: (kw= 'using' kw= 'namespace' this_ID_2= RULE_ID this_End_3= ruleEnd )
            // InternalTemplate.g:236:3: kw= 'using' kw= 'namespace' this_ID_2= RULE_ID this_End_3= ruleEnd
            {
            kw=(Token)match(input,14,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNamespaceAccess().getUsingKeyword_0());
            		
            kw=(Token)match(input,15,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getNamespaceAccess().getNamespaceKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getNamespaceAccess().getIDTerminalRuleCall_2());
            		

            			newCompositeNode(grammarAccess.getNamespaceAccess().getEndParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_End_3=ruleEnd();

            state._fsp--;


            			current.merge(this_End_3);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDataType"
    // InternalTemplate.g:267:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalTemplate.g:267:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalTemplate.g:268:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalTemplate.g:274:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'auto' | kw= 'void' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTemplate.g:280:2: ( (kw= 'auto' | kw= 'void' ) )
            // InternalTemplate.g:281:2: (kw= 'auto' | kw= 'void' )
            {
            // InternalTemplate.g:281:2: (kw= 'auto' | kw= 'void' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTemplate.g:282:3: kw= 'auto'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getAutoKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:288:3: kw= 'void'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeAccess().getVoidKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleLoop"
    // InternalTemplate.g:297:1: entryRuleLoop returns [String current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final String entryRuleLoop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLoop = null;


        try {
            // InternalTemplate.g:297:44: (iv_ruleLoop= ruleLoop EOF )
            // InternalTemplate.g:298:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalTemplate.g:304:1: ruleLoop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'while' kw= '(' this_Boolean_2= ruleBoolean kw= ')' kw= '{' (this_Statement_5= ruleStatement )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleLoop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Boolean_2 = null;

        AntlrDatatypeRuleToken this_Statement_5 = null;



        	enterRule();

        try {
            // InternalTemplate.g:310:2: ( (kw= 'while' kw= '(' this_Boolean_2= ruleBoolean kw= ')' kw= '{' (this_Statement_5= ruleStatement )* kw= '}' ) )
            // InternalTemplate.g:311:2: (kw= 'while' kw= '(' this_Boolean_2= ruleBoolean kw= ')' kw= '{' (this_Statement_5= ruleStatement )* kw= '}' )
            {
            // InternalTemplate.g:311:2: (kw= 'while' kw= '(' this_Boolean_2= ruleBoolean kw= ')' kw= '{' (this_Statement_5= ruleStatement )* kw= '}' )
            // InternalTemplate.g:312:3: kw= 'while' kw= '(' this_Boolean_2= ruleBoolean kw= ')' kw= '{' (this_Statement_5= ruleStatement )* kw= '}'
            {
            kw=(Token)match(input,18,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLoopAccess().getWhileKeyword_0());
            		
            kw=(Token)match(input,19,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getLoopAccess().getBooleanParserRuleCall_2());
            		
            pushFollow(FOLLOW_11);
            this_Boolean_2=ruleBoolean();

            state._fsp--;


            			current.merge(this_Boolean_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,20,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLoopAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,21,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTemplate.g:342:3: (this_Statement_5= ruleStatement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=16 && LA4_0<=17)||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTemplate.g:343:4: this_Statement_5= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getLoopAccess().getStatementParserRuleCall_5());
            	    			
            	    pushFollow(FOLLOW_13);
            	    this_Statement_5=ruleStatement();

            	    state._fsp--;


            	    				current.merge(this_Statement_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            kw=(Token)match(input,22,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBoolean"
    // InternalTemplate.g:363:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalTemplate.g:363:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalTemplate.g:364:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalTemplate.g:370:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' this_AccessOperator_1= ruleAccessOperator ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AccessOperator_1 = null;



        	enterRule();

        try {
            // InternalTemplate.g:376:2: ( (kw= '!' this_AccessOperator_1= ruleAccessOperator ) )
            // InternalTemplate.g:377:2: (kw= '!' this_AccessOperator_1= ruleAccessOperator )
            {
            // InternalTemplate.g:377:2: (kw= '!' this_AccessOperator_1= ruleAccessOperator )
            // InternalTemplate.g:378:3: kw= '!' this_AccessOperator_1= ruleAccessOperator
            {
            kw=(Token)match(input,23,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBooleanAccess().getExclamationMarkKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBooleanAccess().getAccessOperatorParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_AccessOperator_1=ruleAccessOperator();

            state._fsp--;


            			current.merge(this_AccessOperator_1);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleReturn"
    // InternalTemplate.g:397:1: entryRuleReturn returns [String current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final String entryRuleReturn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturn = null;


        try {
            // InternalTemplate.g:397:46: (iv_ruleReturn= ruleReturn EOF )
            // InternalTemplate.g:398:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalTemplate.g:404:1: ruleReturn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleReturn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTemplate.g:410:2: ( (kw= 'return' this_ID_1= RULE_ID ) )
            // InternalTemplate.g:411:2: (kw= 'return' this_ID_1= RULE_ID )
            {
            // InternalTemplate.g:411:2: (kw= 'return' this_ID_1= RULE_ID )
            // InternalTemplate.g:412:3: kw= 'return' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,24,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getReturnAccess().getIDTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleArgumentList"
    // InternalTemplate.g:428:1: entryRuleArgumentList returns [String current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final String entryRuleArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgumentList = null;


        try {
            // InternalTemplate.g:428:52: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalTemplate.g:429:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // InternalTemplate.g:435:1: ruleArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | (kw= ',' this_ArgumentList_4= ruleArgumentList ) ) ;
    public final AntlrDatatypeRuleToken ruleArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ArgumentList_4 = null;



        	enterRule();

        try {
            // InternalTemplate.g:441:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | (kw= ',' this_ArgumentList_4= ruleArgumentList ) ) )
            // InternalTemplate.g:442:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | (kw= ',' this_ArgumentList_4= ruleArgumentList ) )
            {
            // InternalTemplate.g:442:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | (kw= ',' this_ArgumentList_4= ruleArgumentList ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTemplate.g:443:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getArgumentListAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:451:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getArgumentListAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTemplate.g:459:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getArgumentListAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTemplate.g:467:3: (kw= ',' this_ArgumentList_4= ruleArgumentList )
                    {
                    // InternalTemplate.g:467:3: (kw= ',' this_ArgumentList_4= ruleArgumentList )
                    // InternalTemplate.g:468:4: kw= ',' this_ArgumentList_4= ruleArgumentList
                    {
                    kw=(Token)match(input,25,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArgumentListAccess().getCommaKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getArgumentListAccess().getArgumentListParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ArgumentList_4=ruleArgumentList();

                    state._fsp--;


                    				current.merge(this_ArgumentList_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalTemplate.g:488:1: entryRuleFunctionCall returns [String current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final String entryRuleFunctionCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionCall = null;


        try {
            // InternalTemplate.g:488:52: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalTemplate.g:489:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalTemplate.g:495:1: ruleFunctionCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ObjectType_0= ruleObjectType | (this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleFunctionCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ObjectType_0 = null;

        AntlrDatatypeRuleToken this_Generic_1 = null;

        AntlrDatatypeRuleToken this_ArgumentList_3 = null;



        	enterRule();

        try {
            // InternalTemplate.g:501:2: ( (this_ObjectType_0= ruleObjectType | (this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')' ) ) )
            // InternalTemplate.g:502:2: (this_ObjectType_0= ruleObjectType | (this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')' ) )
            {
            // InternalTemplate.g:502:2: (this_ObjectType_0= ruleObjectType | (this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==12||LA7_1==19) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==20||LA7_1==29) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTemplate.g:503:3: this_ObjectType_0= ruleObjectType
                    {

                    			newCompositeNode(grammarAccess.getFunctionCallAccess().getObjectTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectType_0=ruleObjectType();

                    state._fsp--;


                    			current.merge(this_ObjectType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:514:3: (this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')' )
                    {
                    // InternalTemplate.g:514:3: (this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')' )
                    // InternalTemplate.g:515:4: this_Generic_1= ruleGeneric kw= '(' (this_ArgumentList_3= ruleArgumentList )* kw= ')'
                    {

                    				newCompositeNode(grammarAccess.getFunctionCallAccess().getGenericParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_Generic_1=ruleGeneric();

                    state._fsp--;


                    				current.merge(this_Generic_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,19,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalTemplate.g:530:4: (this_ArgumentList_3= ruleArgumentList )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTemplate.g:531:5: this_ArgumentList_3= ruleArgumentList
                    	    {

                    	    					newCompositeNode(grammarAccess.getFunctionCallAccess().getArgumentListParserRuleCall_1_2());
                    	    				
                    	    pushFollow(FOLLOW_16);
                    	    this_ArgumentList_3=ruleArgumentList();

                    	    state._fsp--;


                    	    					current.merge(this_ArgumentList_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    kw=(Token)match(input,20,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleGeneric"
    // InternalTemplate.g:552:1: entryRuleGeneric returns [String current=null] : iv_ruleGeneric= ruleGeneric EOF ;
    public final String entryRuleGeneric() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGeneric = null;


        try {
            // InternalTemplate.g:552:47: (iv_ruleGeneric= ruleGeneric EOF )
            // InternalTemplate.g:553:2: iv_ruleGeneric= ruleGeneric EOF
            {
             newCompositeNode(grammarAccess.getGenericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneric=ruleGeneric();

            state._fsp--;

             current =iv_ruleGeneric.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneric"


    // $ANTLR start "ruleGeneric"
    // InternalTemplate.g:559:1: ruleGeneric returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>' ) | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleGeneric() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_Generic_2 = null;



        	enterRule();

        try {
            // InternalTemplate.g:565:2: ( ( (this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>' ) | this_ID_4= RULE_ID ) )
            // InternalTemplate.g:566:2: ( (this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>' ) | this_ID_4= RULE_ID )
            {
            // InternalTemplate.g:566:2: ( (this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>' ) | this_ID_4= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==13||LA8_1==19) ) {
                    alt8=2;
                }
                else if ( (LA8_1==12) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTemplate.g:567:3: (this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>' )
                    {
                    // InternalTemplate.g:567:3: (this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>' )
                    // InternalTemplate.g:568:4: this_ID_0= RULE_ID kw= '<' this_Generic_2= ruleGeneric kw= '>'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getGenericAccess().getIDTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,12,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGenericAccess().getLessThanSignKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getGenericAccess().getGenericParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_6);
                    this_Generic_2=ruleGeneric();

                    state._fsp--;


                    				current.merge(this_Generic_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGenericAccess().getGreaterThanSignKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTemplate.g:597:3: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_4);
                    		

                    			newLeafNode(this_ID_4, grammarAccess.getGenericAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneric"


    // $ANTLR start "entryRuleObjectType"
    // InternalTemplate.g:608:1: entryRuleObjectType returns [String current=null] : iv_ruleObjectType= ruleObjectType EOF ;
    public final String entryRuleObjectType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjectType = null;


        try {
            // InternalTemplate.g:608:50: (iv_ruleObjectType= ruleObjectType EOF )
            // InternalTemplate.g:609:2: iv_ruleObjectType= ruleObjectType EOF
            {
             newCompositeNode(grammarAccess.getObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectType=ruleObjectType();

            state._fsp--;

             current =iv_ruleObjectType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectType"


    // $ANTLR start "ruleObjectType"
    // InternalTemplate.g:615:1: ruleObjectType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleObjectType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTemplate.g:621:2: (this_ID_0= RULE_ID )
            // InternalTemplate.g:622:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getObjectTypeAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectType"


    // $ANTLR start "entryRuleVarName"
    // InternalTemplate.g:632:1: entryRuleVarName returns [String current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final String entryRuleVarName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarName = null;


        try {
            // InternalTemplate.g:632:47: (iv_ruleVarName= ruleVarName EOF )
            // InternalTemplate.g:633:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // InternalTemplate.g:639:1: ruleVarName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleVarName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalTemplate.g:645:2: (this_ID_0= RULE_ID )
            // InternalTemplate.g:646:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getVarNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalTemplate.g:656:1: entryRuleVarDeclaration returns [String current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final String entryRuleVarDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarDeclaration = null;


        try {
            // InternalTemplate.g:656:54: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalTemplate.g:657:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalTemplate.g:663:1: ruleVarDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DataType_0= ruleDataType | this_ObjectType_1= ruleObjectType ) this_VarName_2= ruleVarName ) ;
    public final AntlrDatatypeRuleToken ruleVarDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DataType_0 = null;

        AntlrDatatypeRuleToken this_ObjectType_1 = null;

        AntlrDatatypeRuleToken this_VarName_2 = null;



        	enterRule();

        try {
            // InternalTemplate.g:669:2: ( ( (this_DataType_0= ruleDataType | this_ObjectType_1= ruleObjectType ) this_VarName_2= ruleVarName ) )
            // InternalTemplate.g:670:2: ( (this_DataType_0= ruleDataType | this_ObjectType_1= ruleObjectType ) this_VarName_2= ruleVarName )
            {
            // InternalTemplate.g:670:2: ( (this_DataType_0= ruleDataType | this_ObjectType_1= ruleObjectType ) this_VarName_2= ruleVarName )
            // InternalTemplate.g:671:3: (this_DataType_0= ruleDataType | this_ObjectType_1= ruleObjectType ) this_VarName_2= ruleVarName
            {
            // InternalTemplate.g:671:3: (this_DataType_0= ruleDataType | this_ObjectType_1= ruleObjectType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=16 && LA9_0<=17)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTemplate.g:672:4: this_DataType_0= ruleDataType
                    {

                    				newCompositeNode(grammarAccess.getVarDeclarationAccess().getDataTypeParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    				current.merge(this_DataType_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:683:4: this_ObjectType_1= ruleObjectType
                    {

                    				newCompositeNode(grammarAccess.getVarDeclarationAccess().getObjectTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_ObjectType_1=ruleObjectType();

                    state._fsp--;


                    				current.merge(this_ObjectType_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_VarName_2=ruleVarName();

            state._fsp--;


            			current.merge(this_VarName_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVarAssign"
    // InternalTemplate.g:708:1: entryRuleVarAssign returns [String current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final String entryRuleVarAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarAssign = null;


        try {
            // InternalTemplate.g:708:49: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalTemplate.g:709:2: iv_ruleVarAssign= ruleVarAssign EOF
            {
             newCompositeNode(grammarAccess.getVarAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarAssign=ruleVarAssign();

            state._fsp--;

             current =iv_ruleVarAssign.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalTemplate.g:715:1: ruleVarAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VarDeclaration_0= ruleVarDeclaration kw= '=' this_FunctionCall_2= ruleFunctionCall ) ;
    public final AntlrDatatypeRuleToken ruleVarAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VarDeclaration_0 = null;

        AntlrDatatypeRuleToken this_FunctionCall_2 = null;



        	enterRule();

        try {
            // InternalTemplate.g:721:2: ( (this_VarDeclaration_0= ruleVarDeclaration kw= '=' this_FunctionCall_2= ruleFunctionCall ) )
            // InternalTemplate.g:722:2: (this_VarDeclaration_0= ruleVarDeclaration kw= '=' this_FunctionCall_2= ruleFunctionCall )
            {
            // InternalTemplate.g:722:2: (this_VarDeclaration_0= ruleVarDeclaration kw= '=' this_FunctionCall_2= ruleFunctionCall )
            // InternalTemplate.g:723:3: this_VarDeclaration_0= ruleVarDeclaration kw= '=' this_FunctionCall_2= ruleFunctionCall
            {

            			newCompositeNode(grammarAccess.getVarAssignAccess().getVarDeclarationParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_VarDeclaration_0=ruleVarDeclaration();

            state._fsp--;


            			current.merge(this_VarDeclaration_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,26,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVarAssignAccess().getEqualsSignKeyword_1());
            		

            			newCompositeNode(grammarAccess.getVarAssignAccess().getFunctionCallParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_FunctionCall_2=ruleFunctionCall();

            state._fsp--;


            			current.merge(this_FunctionCall_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleReturnType"
    // InternalTemplate.g:752:1: entryRuleReturnType returns [String current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final String entryRuleReturnType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnType = null;


        try {
            // InternalTemplate.g:752:50: (iv_ruleReturnType= ruleReturnType EOF )
            // InternalTemplate.g:753:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalTemplate.g:759:1: ruleReturnType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DataType_0= ruleDataType | this_Generic_1= ruleGeneric ) ;
    public final AntlrDatatypeRuleToken ruleReturnType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DataType_0 = null;

        AntlrDatatypeRuleToken this_Generic_1 = null;



        	enterRule();

        try {
            // InternalTemplate.g:765:2: ( (this_DataType_0= ruleDataType | this_Generic_1= ruleGeneric ) )
            // InternalTemplate.g:766:2: (this_DataType_0= ruleDataType | this_Generic_1= ruleGeneric )
            {
            // InternalTemplate.g:766:2: (this_DataType_0= ruleDataType | this_Generic_1= ruleGeneric )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTemplate.g:767:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getReturnTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current.merge(this_DataType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:778:3: this_Generic_1= ruleGeneric
                    {

                    			newCompositeNode(grammarAccess.getReturnTypeAccess().getGenericParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Generic_1=ruleGeneric();

                    state._fsp--;


                    			current.merge(this_Generic_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleAccessOperator"
    // InternalTemplate.g:792:1: entryRuleAccessOperator returns [String current=null] : iv_ruleAccessOperator= ruleAccessOperator EOF ;
    public final String entryRuleAccessOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccessOperator = null;


        try {
            // InternalTemplate.g:792:54: (iv_ruleAccessOperator= ruleAccessOperator EOF )
            // InternalTemplate.g:793:2: iv_ruleAccessOperator= ruleAccessOperator EOF
            {
             newCompositeNode(grammarAccess.getAccessOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccessOperator=ruleAccessOperator();

            state._fsp--;

             current =iv_ruleAccessOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessOperator"


    // $ANTLR start "ruleAccessOperator"
    // InternalTemplate.g:799:1: ruleAccessOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ObjectType_0= ruleObjectType (kw= '.' | kw= '->' ) this_FunctionCall_3= ruleFunctionCall ) ;
    public final AntlrDatatypeRuleToken ruleAccessOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ObjectType_0 = null;

        AntlrDatatypeRuleToken this_FunctionCall_3 = null;



        	enterRule();

        try {
            // InternalTemplate.g:805:2: ( (this_ObjectType_0= ruleObjectType (kw= '.' | kw= '->' ) this_FunctionCall_3= ruleFunctionCall ) )
            // InternalTemplate.g:806:2: (this_ObjectType_0= ruleObjectType (kw= '.' | kw= '->' ) this_FunctionCall_3= ruleFunctionCall )
            {
            // InternalTemplate.g:806:2: (this_ObjectType_0= ruleObjectType (kw= '.' | kw= '->' ) this_FunctionCall_3= ruleFunctionCall )
            // InternalTemplate.g:807:3: this_ObjectType_0= ruleObjectType (kw= '.' | kw= '->' ) this_FunctionCall_3= ruleFunctionCall
            {

            			newCompositeNode(grammarAccess.getAccessOperatorAccess().getObjectTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_ObjectType_0=ruleObjectType();

            state._fsp--;


            			current.merge(this_ObjectType_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalTemplate.g:817:3: (kw= '.' | kw= '->' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTemplate.g:818:4: kw= '.'
                    {
                    kw=(Token)match(input,27,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAccessOperatorAccess().getFullStopKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:824:4: kw= '->'
                    {
                    kw=(Token)match(input,28,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAccessOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getAccessOperatorAccess().getFunctionCallParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_FunctionCall_3=ruleFunctionCall();

            state._fsp--;


            			current.merge(this_FunctionCall_3);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessOperator"


    // $ANTLR start "entryRuleFunction"
    // InternalTemplate.g:844:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // InternalTemplate.g:844:48: (iv_ruleFunction= ruleFunction EOF )
            // InternalTemplate.g:845:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalTemplate.g:851:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ReturnType_0= ruleReturnType this_ID_1= RULE_ID kw= '(' kw= ')' kw= '{' (this_Statement_5= ruleStatement | this_Loop_6= ruleLoop )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ReturnType_0 = null;

        AntlrDatatypeRuleToken this_Statement_5 = null;

        AntlrDatatypeRuleToken this_Loop_6 = null;



        	enterRule();

        try {
            // InternalTemplate.g:857:2: ( (this_ReturnType_0= ruleReturnType this_ID_1= RULE_ID kw= '(' kw= ')' kw= '{' (this_Statement_5= ruleStatement | this_Loop_6= ruleLoop )* kw= '}' ) )
            // InternalTemplate.g:858:2: (this_ReturnType_0= ruleReturnType this_ID_1= RULE_ID kw= '(' kw= ')' kw= '{' (this_Statement_5= ruleStatement | this_Loop_6= ruleLoop )* kw= '}' )
            {
            // InternalTemplate.g:858:2: (this_ReturnType_0= ruleReturnType this_ID_1= RULE_ID kw= '(' kw= ')' kw= '{' (this_Statement_5= ruleStatement | this_Loop_6= ruleLoop )* kw= '}' )
            // InternalTemplate.g:859:3: this_ReturnType_0= ruleReturnType this_ID_1= RULE_ID kw= '(' kw= ')' kw= '{' (this_Statement_5= ruleStatement | this_Loop_6= ruleLoop )* kw= '}'
            {

            			newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_ReturnType_0=ruleReturnType();

            state._fsp--;


            			current.merge(this_ReturnType_0);
            		

            			afterParserOrEnumRuleCall();
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getFunctionAccess().getIDTerminalRuleCall_1());
            		
            kw=(Token)match(input,19,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            kw=(Token)match(input,20,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,21,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalTemplate.g:891:3: (this_Statement_5= ruleStatement | this_Loop_6= ruleLoop )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=16 && LA12_0<=17)||LA12_0==24) ) {
                    alt12=1;
                }
                else if ( (LA12_0==18) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTemplate.g:892:4: this_Statement_5= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getFunctionAccess().getStatementParserRuleCall_5_0());
            	    			
            	    pushFollow(FOLLOW_21);
            	    this_Statement_5=ruleStatement();

            	    state._fsp--;


            	    				current.merge(this_Statement_5);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalTemplate.g:903:4: this_Loop_6= ruleLoop
            	    {

            	    				newCompositeNode(grammarAccess.getFunctionAccess().getLoopParserRuleCall_5_1());
            	    			
            	    pushFollow(FOLLOW_21);
            	    this_Loop_6=ruleLoop();

            	    state._fsp--;


            	    				current.merge(this_Loop_6);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            kw=(Token)match(input,22,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleStatement"
    // InternalTemplate.g:923:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalTemplate.g:923:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalTemplate.g:924:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTemplate.g:930:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn ) this_End_5= ruleEnd ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_VarDeclaration_0 = null;

        AntlrDatatypeRuleToken this_VarAssign_1 = null;

        AntlrDatatypeRuleToken this_FunctionCall_2 = null;

        AntlrDatatypeRuleToken this_AccessOperator_3 = null;

        AntlrDatatypeRuleToken this_Return_4 = null;

        AntlrDatatypeRuleToken this_End_5 = null;



        	enterRule();

        try {
            // InternalTemplate.g:936:2: ( ( (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn ) this_End_5= ruleEnd ) )
            // InternalTemplate.g:937:2: ( (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn ) this_End_5= ruleEnd )
            {
            // InternalTemplate.g:937:2: ( (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn ) this_End_5= ruleEnd )
            // InternalTemplate.g:938:3: (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn ) this_End_5= ruleEnd
            {
            // InternalTemplate.g:938:3: (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn )
            int alt13=5;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalTemplate.g:939:4: this_VarDeclaration_0= ruleVarDeclaration
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getVarDeclarationParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_VarDeclaration_0=ruleVarDeclaration();

                    state._fsp--;


                    				current.merge(this_VarDeclaration_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTemplate.g:950:4: this_VarAssign_1= ruleVarAssign
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getVarAssignParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_VarAssign_1=ruleVarAssign();

                    state._fsp--;


                    				current.merge(this_VarAssign_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTemplate.g:961:4: this_FunctionCall_2= ruleFunctionCall
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_8);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;


                    				current.merge(this_FunctionCall_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalTemplate.g:972:4: this_AccessOperator_3= ruleAccessOperator
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getAccessOperatorParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_8);
                    this_AccessOperator_3=ruleAccessOperator();

                    state._fsp--;


                    				current.merge(this_AccessOperator_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalTemplate.g:983:4: this_Return_4= ruleReturn
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_Return_4=ruleReturn();

                    state._fsp--;


                    				current.merge(this_Return_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getStatementAccess().getEndParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_End_5=ruleEnd();

            state._fsp--;


            			current.merge(this_End_5);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleEnd"
    // InternalTemplate.g:1008:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // InternalTemplate.g:1008:43: (iv_ruleEnd= ruleEnd EOF )
            // InternalTemplate.g:1009:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalTemplate.g:1015:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTemplate.g:1021:2: (kw= ';' )
            // InternalTemplate.g:1022:2: kw= ';'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEndAccess().getSemicolonKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\4\4\1\uffff\1\32\4\uffff";
    static final String dfa_3s = "\1\30\2\4\1\35\1\uffff\1\35\4\uffff";
    static final String dfa_4s = "\4\uffff\1\5\1\uffff\1\3\1\4\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\13\uffff\1\1\1\2\6\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\5\7\uffff\1\6\6\uffff\1\6\7\uffff\2\7\1\6",
            "",
            "\1\11\2\uffff\1\10",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "938:3: (this_VarDeclaration_0= ruleVarDeclaration | this_VarAssign_1= ruleVarAssign | this_FunctionCall_2= ruleFunctionCall | this_AccessOperator_3= ruleAccessOperator | this_Return_4= ruleReturn )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000034812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000014B4810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002100070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000036810L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000B4810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000014F4810L});

}