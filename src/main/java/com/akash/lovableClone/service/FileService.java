package com.akash.lovableClone.service;

import com.akash.lovableClone.dto.project.FileContentResponse;
import com.akash.lovableClone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService
{
    List<FileNode> getFileTree(Long userId, Long projectId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
