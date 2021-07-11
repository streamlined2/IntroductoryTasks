package edu.tasks.task3;

public class SessionBean {
	
	private static interface LearningMaterials {
		boolean study(Mentor mentor);
	}
	
	private static interface ResearchResult {
		LearningMaterials collectLearningMaterials();
	}
	
	public static class BeanException extends Exception {
		public BeanException(String msg) { super(msg);}
	}
	
	public void introduceSubject(University university, Mentor mentor, Subject subject) throws BeanException {
		ResearchResult researchResult = doResearch(subject);
		LearningMaterials learningMaterials = researchResult.collectLearningMaterials();
		if(learningMaterials.study(mentor)) {
			university.addSubject(subject);
			mentor.addSubject(subject);
		}else throw new BeanException(String.format("can't introduce new subject %s",subject.toString()));
	}

	private boolean study(Mentor mentor, LearningMaterials learningMaterials) {
		return false;//TODO
	}

	private LearningMaterials collectLearningMaterials(ResearchResult researchResult) {
		return null;//TODO
	}

	private ResearchResult doResearch(Subject subject) {
		return null;//TODO
	}

}
