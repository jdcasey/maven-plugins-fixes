package org.issue;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

/* @formatter:off */
@SupportedAnnotationTypes( { 
    "org.issue.MCompiler224"
} )
/* @formatter:on */
@SupportedSourceVersion( SourceVersion.RELEASE_6 )
public class MCompiler224AnnotationProcessor
    extends AbstractProcessor
{

    @Override
    public boolean process( final Set<? extends TypeElement> elts, final RoundEnvironment env )
    {
        System.out.println( "RUNNING on: " + elts );
        final Messager messager = this.processingEnv.getMessager();

        final Kind[] toTest = { Kind.MANDATORY_WARNING, Kind.NOTE, Kind.OTHER, Kind.WARNING };

        for ( final Kind kind : toTest )
        {
            messager.printMessage( kind, "Testing message with KIND: " + kind );
        }

        return true;
    }

}
