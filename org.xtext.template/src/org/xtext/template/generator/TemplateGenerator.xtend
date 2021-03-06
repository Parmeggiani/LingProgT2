/*
 * generated by Xtext 2.14.0
 */
package org.xtext.template.generator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class TemplateGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context)
	{
		fsa.generateFile('FileReader.cpp', FileReader)		
	}
	
	
	CharSequence FileReader = 
			'''
			#include <iostream>\n
			#include <fstream>\n
			#include <memory>\n
			#include <string>\n
			#include <vector>\n
			
			using namespace std;\n
			
			//Auto Generated Function\n
			unique_ptr<vector<string>> FileReader()\n
			{\n
				string line;\n
				ifstream file;\n
				file.open("FileToRead.txt");\n\n
				auto buffer = make_unique<vector<string>>();\n
				while(!file.eof())\n
				{\n
					getline(file, line);\n
					buffer->push_bash(line);\n
				}\n
				file.close();\n\n
				return buffer;\n
			}\n
			'''
}
