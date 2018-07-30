import org.dotnet.ci.pipelines.Pipeline

def windowsESPipeline = Pipeline.createPipeline(this, 'build/buildpipeline/windows-es.groovy')
String configuration = 'Release'
def parameters = [
    'Configuration': configuration
]

windowsESPipeline.triggerPipelineOnEveryGithubPR("Windows ${configuration} Spanish Language x64 Build", parameters)
windowsESPipeline.triggerPipelineOnGithubPush(parameters)
