package dat102.f07.hanoi;

import java.util.function.BiConsumer;

public class MyHanoiSolver implements HanoiSolver {

	@Override
	public void solveHanoi(BiConsumer<Integer, Integer> diskMover, 
			int diskCount, int from, int dest, int by) {

		/*
		 * solveHanoi med n-1 disker fra from til by
		 * flytt disk n fra from til dest
		 * solveHanoi med n-1 disker fra by til dest
		 */
		if (diskCount > 0) {
			solveHanoi(diskMover, diskCount-1, from, by, dest);
			diskMover.accept(from, dest);
			solveHanoi(diskMover, diskCount-1, by, dest, from);
		}
		
		
	}
}