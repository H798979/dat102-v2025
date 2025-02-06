package dat102.f07.hanoi;

import java.util.function.BiConsumer;

public class MyHanoiSolver implements HanoiSolver {

	@Override
	public void solveHanoi(BiConsumer<Integer, Integer> diskMover, 
			int diskCount, int from, int dest, int by) {
			
	   if (diskCount > 0) {
	     	solveHanoi(diskMover, diskCount-1, from, by, dest);
		    diskMover.accept(from, dest);
		    solveHanoi(diskMover, diskCount-1, by, dest, from);
			}



	}
}