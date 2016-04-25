package test;

import org.metaborg.core.editor.IEditorRegistry;
import org.metaborg.core.editor.NullEditorRegistry;
import org.metaborg.core.project.IProjectService;
import org.metaborg.core.project.ISimpleProjectService;
import org.metaborg.core.project.SimpleProjectService;
import org.metaborg.spoofax.core.SpoofaxModule;

import com.google.inject.Singleton;

public class TestModule extends SpoofaxModule {
	@Override
	protected void configure() {
		super.configure();
	}
	
	@Override
	protected void bindProject() {
        bind(SimpleProjectService.class).in(Singleton.class);
        bind(ISimpleProjectService.class).to(SimpleProjectService.class);
        bind(IProjectService.class).to(SimpleProjectService.class);
	}
	
	@Override
	protected void bindEditor() {
		bind(IEditorRegistry.class).to(NullEditorRegistry.class).in(Singleton.class);
	}
}
