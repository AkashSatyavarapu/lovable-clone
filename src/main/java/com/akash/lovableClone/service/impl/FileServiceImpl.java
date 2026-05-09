package com.akash.lovableClone.service.impl;

import com.akash.lovableClone.dto.project.FileContentResponse;
import com.akash.lovableClone.dto.project.FileNode;
import com.akash.lovableClone.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService
{
    @Override
    public List<FileNode> getFileTree(Long userId, Long projectId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
