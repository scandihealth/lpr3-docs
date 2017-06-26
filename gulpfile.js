var gulp = require('gulp');
var exec = require('child_process').exec, child;


gulp.task('markdown', function() {
child = exec('mkdocs build --clean', function (error, stdout, stderr) {
        console.log('stdout: ' + stdout);
        console.log('stderr: ' + stderr);
        if (error !== null) {
             console.log('exec error: ' + error);
        }
    });
});

gulp.task('default', ['markdown'], function() {
    gulp.watch(['**/*.md', 'mkdocs.yml', 'assets/**/*'], ['markdown']);
});