package completablefuture;

import worker.WorkerRunnableThread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// Runnable (caller 연결 O)
// scouter option
// hook_service_patterns=completablefuture.CompletableFutureExample.main
// hook_async_callrunnable_scan_package_prefixes=completablefuture
public class CompletableFutureExample {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		CompletableFuture<Void> future = CompletableFuture.runAsync(new WorkerRunnableThread());
		future.get();
	}
}
