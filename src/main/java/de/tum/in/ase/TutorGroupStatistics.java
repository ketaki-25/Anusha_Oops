package de.tum.in.ase;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Stream;

public final class TutorGroupStatistics {
	private TutorGroupStatistics() {
	}

	public static double averageDuration(Stream<TutorGroupMeeting> meetingStream) {
		return 0;
	}

	public static Set<Skill> repeatedSkills(Stream<TutorGroupMeeting> meetings) {
		return Collections.emptySet();
	}

	public static Set<Student> studentsWithSpecificSkill(TutorGroup tutorGroup, Skill skill) {
		return Collections.emptySet();
	}
}
