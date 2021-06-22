package ca.lvin.books.jenkins

class RandomWord {
    private def pipelineSteps
    private List<String> words
    private Random random

    public RandomWord(pipelineSteps) {
        this.pipelineSteps = pipelineSteps
        this.words = this.readResourcesAsList("words.txt")
        this.random = new Random()
    }

    public String get() {
        int wordIndex = this.random.nextInt(this.words.size())
        String capitalized = org.apache.commons.lang.WordUtils.capitalizeFully(this.words[wordIndex])
        return capitalized
    }

    @NonCPS
    private List readResourcesAsList(String name) {
        String resource = this.pipelineSteps.libraryResource(name)
        return resource.split()
    }
}
